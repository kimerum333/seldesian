package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.entity.User;
import tales.akiba.seldesian.service.UserService;

@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

	// 회원목록조회	 /User/List
	@RequestMapping("/User/List")
	public  List<User>  list( Model model  ) {
		
		List<User>  userList = userService.getUserList();
		model.addAttribute( "userList" , userList);		
		return  userList;
	}
	
	//회원가입  
	//@RequestMapping("/User/WriteForm")
	//public  String  writeform() {
	//	return  "user/write";
	//}
	
	//회원가입 -> 저장
	@RequestMapping("/User/Write")
	public  String  write(	User  user ) {
			
		// 회원정보저장
		userService.insertUser(user);					
		
		return "redirect:/user/list";   // 목록 조회
	}
	
	// 회원정보보기 
	@RequestMapping("/User/View")
	public  String   userview( User user, Model model ) {
		
		User userdata = userService.getView( user );
		model.addAttribute("user", userdata);
		
		return  "user/view"; 
	}
	
	// 회원삭제  // /User/Delete
	@RequestMapping("/User/Delete/{email}")
	public   String   delete(  
	    User user	
		) {
				
		userService.deleteUser( user );
		
		return "redirect:/User/List";
	}
	
	@RequestMapping("/User/UpdateForm")
	public  String   updateForm(User user, Model model) {
		
		// 수정할 정보를 조회한다
		User  userdata  =  userService.getView(user);
		model.addAttribute( "user", userdata );
		
		return  "user/update";
	}
	// 수정 정보 저장
	@RequestMapping("/User/Update")
	public  String   update( User user ) {
		
		userService.updateUser( user );
		
		return "redirect:/User/List";
	}
}