package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tales.akiba.seldesian.service.UserService;
import tales.akiba.seldesian.vo.UserVo;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	// 유저가져오기
	@RequestMapping("/seldesian")
	public String seldesian(Model model) {
		
		List<UserVo> userList = userService.getUserList();
		model.addAttribute( "userList" , userList);

		return "seldesian/login";
		
	}
	
	// 회원정보보기  
	@RequestMapping("/seldesian/View")
	public  String   view( UserVo vo, Model model ) {
		
		UserVo user = userService.getUser( vo );
		model.addAttribute("user", user);
		
		return  "/seldesian/view";    
	}
	
	//회원가입
	@RequestMapping("/seldesian/WriteForm")
	public  String  writeform(){
	
            return  "/seldesian/write";

	}
	
	//회원가입 -> 저장 
	@RequestMapping("/seldesian/Write")
	public  String  write(	UserVo  vo ) {
		
		// 회원정보저장
		userService.insertUser(vo);					
		
		return "/seldesian";   // 목록 조회
	}
	
	// 회원삭제
	@RequestMapping("/seldesian/Delete/{email}")
	public   String   delete(  
	    UserVo vo	
		) {
				
		userService.deleteUser( vo );
		
		return "redirect:/seldesian";
	}
	
	// 회원정보 수정
	@RequestMapping("/seldesian/UpdateForm")
	public String updateForm(UserVo vo, Model model) {
		
		// 수정할 정보를 조회한다.
		UserVo user  = userService.getUser(vo);
		model.addAttribute("user", user);
		
		return "/seldesian/update";
	}
	
	// 수정 정보 저장
	@RequestMapping("/seldesian/Update")
	public String update(UserVo vo) {
		
		userService.userUpdate(vo);
		
		return "redirect:/User/List";
	}

}
