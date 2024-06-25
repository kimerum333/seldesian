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
import tales.akiba.seldesian.entity.Prop;
import tales.akiba.seldesian.service.PropService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Prop")
public class PropController {

    @Autowired
    private PropService propService;

    // 프리픽스드목록조회
    @GetMapping("/List")
    public List<Prop> list(Model model) {
        List<Prop> propList = propService.getPropList();
        model.addAttribute("propList", propList);
        return propList;
    }

    // 프리픽스드추가
    @PostMapping("/Write")
    public String write(@RequestBody Prop prop) {
        propService.insertProp(prop);
        return "redirect:/Prop/List";  // 목록 조회
    }

    // 프리픽스드 확인
    @GetMapping("/View")
    public Prop propview(@RequestBody Prop prop, Model model) {
        Prop propdata = propService.getView(prop);
        model.addAttribute("prop", propdata);
        return propdata;
    }

    // 프리픽스드삭제
    @DeleteMapping("/Delete/{prop_no}")
    public String delete(@PathVariable String prop_no) {
        Prop prop = new Prop();
        prop.setProp_No(prop_no);
        propService.deleteProp(prop);
        return "redirect:/Prop/List";
    }

    // 프롭정보 수정 폼
    @GetMapping("/UpdateForm")
    public Prop updateForm(@RequestBody Prop prop, Model model) {
        Prop propdata = propService.getView(prop);
        model.addAttribute("prop", propdata);
        return propdata;
    }

    // 수정 정보 저장
    @PutMapping("/Update")
    public String update(@RequestBody Prop prop) {
        propService.updateProp(prop);
        return "redirect:/Prop/List";
    }
}