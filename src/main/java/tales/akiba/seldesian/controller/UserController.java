package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.entity.User;
import tales.akiba.seldesian.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
 
    @Autowired
    private UserService userService;


    // 회원가입
    @PostMapping("/writeuser")
    public void insertUser(@RequestBody User user) {
        userService.insertUser(user);
    }
    
    // 유저리스트
    @GetMapping("/userlist")
    public List<User> getUserList(){
    	return userService.getUserList();
    }
    
	@PatchMapping("/updateuser")
	public void updateUser(@RequestBody User user) {
		 userService.updateUser(user);
	}

	@PatchMapping("/deleteuser")
	public void deleteUser(@RequestBody User user) {
		 userService.deleteUser(user);
	}
    
}