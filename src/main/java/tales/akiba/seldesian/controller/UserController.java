package tales.akiba.seldesian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tales.akiba.seldesian.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	// 유저가져오기
	@RequestMapping("/seldesian")
	public String seldesian() {
		
		String userCheck = userService.userReturner();
		return userCheck;
		
	}

}
