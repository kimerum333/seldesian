package tales.akiba.seldesian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.dao.UserMapper;
import tales.akiba.seldesian.entity.User;
import tales.akiba.seldesian.service.UserService;

@Service 
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public boolean insertUser(User user) {
        try {
            userMapper.insertUser(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
    
    @Override
    public User getView(String email) {
        return userMapper.getView(email);
    }

    @Override
    public boolean deleteUser(String email) {
        try {
            userMapper.deleteUser(email);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void userUpdate(User user) {
        userMapper.updateUser(user);        
    }
}