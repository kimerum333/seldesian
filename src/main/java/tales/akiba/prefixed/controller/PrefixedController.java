package tales.akiba.prefixed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tales.akiba.prefixed.service.PrefixedService;
import tales.akiba.prefixed.vo.PrefixedVo;

@Controller
public class PrefixedController {

	@Autowired
	PrefixedService prefixedService;
	
	// 프리픽스드리스트 가져오기
	@RequestMapping("/Prefixed/List")
	public String Prefixed(Model model) {
		
		List<PrefixedVo> prefixedList = prefixedService.getPrefixedList();
		model.addAttribute( "prefixedList" , prefixedList);

		return "prefixed/list";
		
	}
	
	// 프리픽스드정보
	@RequestMapping("/Prefixed/View")
	public  String   view( PrefixedVo vo, Model model ) {
		
		PrefixedVo prefixed = prefixedService.getPrefixed( vo );
		model.addAttribute("prefixed", prefixed);
		
		return  "/prefixed/view";    
	}
	
	// 프리픽스드 추가
	@RequestMapping("/Prefixed/WriteForm")
	public  String  writeform(){
	
            return  "/prefixed/write";

	}
	
	//프리픽스드 추가 -> 저장 
	@RequestMapping("/Prefixed/Write")
	public  String  write(	PrefixedVo  vo ) {
		
		// 프리픽스드 데이터추가
		prefixedService.insertPrefixed(vo);					
		
		return "/prefixed/list";  
	}
	
	// 프리픽스드삭제
	@RequestMapping("/Prefixed/Delete/{prefixed_no}")
	public   String   delete(  
	    PrefixedVo vo	
		) {
				
		prefixedService.deletePrefixed( vo );
		
		return "redirect:/prefixed/list";
	}
	
	// 프리픽스드정보 수정
	@RequestMapping("/Prefixed/UpdateForm")
	public String updateForm(PrefixedVo vo, Model model) {
		
		// 수정할 정보를 조회한다.
		PrefixedVo prefixed  = prefixedService.getPrefixed(vo);
		model.addAttribute("prefixed", prefixed);
		
		return "/prefixed/update";
	}
	
	// 수정 정보 저장
	@RequestMapping("/Prefixed/Update")
	public String update(PrefixedVo vo) {
		
		prefixedService.prefixedUpdate(vo);
		
		return "redirect:/prefixed/list";
	}

	
}
