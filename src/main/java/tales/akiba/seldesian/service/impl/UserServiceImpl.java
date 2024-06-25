package tales.akiba.seldesian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tales.akiba.seldesian.dao.UserMapper;
import tales.akiba.seldesian.entity.User;
import tales.akiba.seldesian.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void insertUser(User user) {

		userMapper.insertUser(user);
	}

	@Override
	public List<User> getUserList() {
		List<User>  userList  =  userMapper.getUserList(); 
		return    userList;
	}

	@Override
	public void deleteUser(User user) {

		userMapper.deleteUser( user );
		
	}

	@Override
	public User getView(User user) {
		User  userdata = userMapper.getView(user);
		
		return  userdata;
	}

	@Override
	public void userUpdate(User user) {
		
		userMapper.updateUser(user);		
		
	}

}
