package tales.akiba.seldesian.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.seldesian.dao.UserMapper;
import tales.akiba.seldesian.service.UserService;
import tales.akiba.seldesian.vo.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userDao;

	@Override
	public List<UserVo> getUserList() {
		List<UserVo>  userList  =  userDao.getUserList(); 
		return    userList;
	}

	@Override
	public UserVo getUser(UserVo vo) {
		UserVo  user = userDao.getUser(vo);
		
		return  user;
	}

	@Override
	public void deleteUser(UserVo vo) {

		userDao.deleteUser( vo );
		
	}

	@Override
	public void insertUser(UserVo vo) {

		userDao.insertUser( vo );
		
	}

	@Override
	public void userUpdate(UserVo vo) {

		userDao.updateUser(vo);		
		
	}

}
