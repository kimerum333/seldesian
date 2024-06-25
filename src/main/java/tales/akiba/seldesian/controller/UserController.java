package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    // 회원목록조회
    @GetMapping("/user/list")
    public List<User> userlist() {
        return userService.getUserList();
    }

    // 회원 정보 보기
    @GetMapping("/user/view")
    public User userview(@RequestParam(value = "email", required = false) String email) {
        return userService.getView(email);
    }

    // 회원가입 처리
    @PostMapping("/user/write")
    public boolean write(@ModelAttribute User params) {
        return userService.insertUser(params);
    }

    // 회원삭제
    @PostMapping("/user/delete")
    public boolean delete(@RequestParam(value="email", required = false) String email) {
        if (email == null) {
            return false; 
        }
        try {
            return userService.deleteUser(email);
        } catch (DataAccessException e) {
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    // 회원정보 수정 페이지
    @GetMapping("/updateForm")
    public User updateForm(@RequestParam(value = "email", required = false) String email) {
        return userService.getView(email);
    }

    // 수정 정보 저장
    @PostMapping("/update")
    public boolean update(@ModelAttribute User user) {
        try {
            userService.userUpdate(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
