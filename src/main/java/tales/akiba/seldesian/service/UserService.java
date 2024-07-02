package tales.akiba.seldesian.service;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.seldesian.dao.UserMapper;
import tales.akiba.seldesian.entity.User;


@Service
public class UserService {
	
	@Autowired
	UserMapper userMapper;
	
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	public List<User> getUserList() {
		return userMapper.getUserList();
	}

	public void updateUser(User user) {
		userMapper.updateUser(user);
		
	}

	public void deleteUser(User user) {
		userMapper.deleteeUser(user);
		
	}


}
