package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tales.akiba.seldesian.entity.User;
import tales.akiba.seldesian.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	

    // 회원가입 페이지
    @GetMapping("/user/signup")
    public String userSignup() {
        return "/signup";
    }

    // 회원가입 처리
    @PostMapping("/user/signup")
    public String userSignup(User user) {
        userService.insertUser(user);

        return "redirect:/user/login";
    }
    
	// 회원목록조회	 /User/List
	@RequestMapping("/User/List")
	public  String  list( Model model  ) {
		
		// db 조회 정보가지고 온다
		List<User>  userList = userService.getUserList();
		model.addAttribute( "userList" , userList);
		
		return  "user/login"; 
	}

	// 회원삭제 
	@RequestMapping("/user/delete/{email}")
	public   String   delete(User user) {
				
		userService.deleteUser( user );
		
		return "redirect:/";
	}
	
	// 회원정보 수정
	@RequestMapping("/user/updateForm")
	public String updateForm(User user, Model model) {
		
		// 수정할 정보를 조회한다.
		User userdata  = userService.getView(user);
		model.addAttribute("user", userdata);
		
		return "user/update";
	}
	
	// 수정 정보 저장
	@RequestMapping("/user/update")
	public String update(User user) {
		
		userService.userUpdate(user);
		
		return "redirect:/user/List";
	}
	
}
