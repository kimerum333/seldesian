package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.entity.User;
import tales.akiba.seldesian.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    // 회원목록조회
    @GetMapping("/List")
    public List<User> list(Model model) {
        List<User> userList = userService.getUserList();
        model.addAttribute("userList", userList);
        return userList;
    }

    // 회원가입
    @PostMapping("/Write")
    public String write(@RequestBody User user) {
        userService.insertUser(user);
        return "redirect:/User/List";  // 목록 조회
    }

    // 회원정보보기
    @GetMapping("/View")
    public User userview(@RequestBody User user, Model model) {
        User userdata = userService.getView(user);
        model.addAttribute("user", userdata);
        return userdata;
    }

    // 회원삭제
    @PutMapping("/Delete/{email}")
    public String delete(@PathVariable String email) {
        User user = new User();
        user.setEmail(email);
        userService.deleteUser(user);
        return "redirect:/User/List";
    }

    // 회원정보 수정 폼
    @GetMapping("/UpdateForm")
    public User updateForm(@RequestBody User user, Model model) {
        User userdata = userService.getView(user);
        model.addAttribute("user", userdata);
        return userdata;
    }

    // 수정 정보 저장
    @PutMapping("/Update")
    public String update(@RequestBody User user) {
        userService.updateUser(user);
        return "redirect:/User/List";
    }
}