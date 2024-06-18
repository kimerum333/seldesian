package tales.akiba.prop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tales.akiba.prop.service.PropService;
import tales.akiba.prop.vo.PropVo;

@Controller
public class PropController {

	@Autowired
	PropService propService;
	
	// 프롭리스트 가져오기
	@RequestMapping("/Prop/List")
	public String Prop(Model model) {
		
		List<PropVo> propList = propService.getPropList();
		model.addAttribute( "propList" , propList);

		return "prop/list";
		
	}
	
	// 프롭정보
	@RequestMapping("/Prop/View")
	public  String   view( PropVo vo, Model model ) {
		
		PropVo prop = propService.getProp( vo );
		model.addAttribute("prop", prop);
		
		return  "/prop/view";    
	}
	
	// 프롭 추가
	@RequestMapping("/Prop/WriteForm")
	public  String  writeform(){
	
            return  "/prop/write";

	}
	
	//프롭 추가 -> 저장 
	@RequestMapping("/Prop/Write")
	public  String  write(	PropVo  vo ) {
		
		// 프롭 데이터추가
		propService.insertProp(vo);					
		
		return "/prop/list";  
	}
	
	// 프롭삭제
	@RequestMapping("/Prop/Delete/{prop_no}")
	public   String   delete(  
	    PropVo vo	
		) {
				
		propService.deleteProp( vo );
		
		return "redirect:/prop/list";
	}
	
	// 프롭정보 수정
	@RequestMapping("/Prop/UpdateForm")
	public String updateForm(PropVo vo, Model model) {
		
		// 수정할 정보를 조회한다.
		PropVo prop  = propService.getProp(vo);
		model.addAttribute("prop", prop);
		
		return "/prop/update";
	}
	
	// 수정 정보 저장
	@RequestMapping("/Prop/Update")
	public String update(PropVo vo) {
		
		propService.propUpdate(vo);
		
		return "redirect:/prop/list";
	}

	
}
