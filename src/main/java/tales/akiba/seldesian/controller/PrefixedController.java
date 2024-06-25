package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.entity.Prefixed;
import tales.akiba.seldesian.service.PrefixedService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Prefixed")
public class PrefixedController {

    @Autowired
    private PrefixedService prefixedService;

    // 프리픽스드목록조회
    @GetMapping("/List")
    public List<Prefixed> list(Model model) {
        List<Prefixed> prefixedList = prefixedService.getPrefixedList();
        model.addAttribute("prefixedList", prefixedList);
        return prefixedList;
    }

    // 프리픽스드추가
    @PostMapping("/Write")
    public String write(@RequestBody Prefixed prefixed) {
        prefixedService.insertPrefixed(prefixed);
        return "redirect:/Prefixed/List";  // 목록 조회
    }

    // 프리픽스드 확인
    @GetMapping("/View")
    public Prefixed prefixedview(@RequestBody Prefixed prefixed, Model model) {
        Prefixed prefixeddata = prefixedService.getView(prefixed);
        model.addAttribute("prefixed", prefixeddata);
        return prefixeddata;
    }

    // 프리픽스드삭제
    @DeleteMapping("/Delete/{prefixed_no}")
    public String delete(@PathVariable String prefixed_no) {
        Prefixed prefixed = new Prefixed();
        prefixed.setPrefixed_No(prefixed_no);
        prefixedService.deletePrefixed(prefixed);
        return "redirect:/Prefixed/List";
    }

    // 회원정보 수정 폼
    @GetMapping("/UpdateForm")
    public Prefixed updateForm(@RequestBody Prefixed prefixed, Model model) {
        Prefixed prefixeddata = prefixedService.getView(prefixed);
        model.addAttribute("prefixed", prefixeddata);
        return prefixeddata;
    }

    // 수정 정보 저장
    @PutMapping("/Update")
    public String update(@RequestBody Prefixed prefixed) {
        prefixedService.updatePrefixed(prefixed);
        return "redirect:/Prefixed/List";
    }
}