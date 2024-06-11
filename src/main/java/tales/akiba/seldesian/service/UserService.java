package tales.akiba.seldesian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.seldesian.dao.UserMapper;
import tales.akiba.seldesian.vo.UserVo;

public interface UserService {

	List<UserVo> getUserList();

	UserVo getUser(UserVo vo);

	void deleteUser(UserVo vo);

	void insertUser(UserVo vo);

	void userUpdate(UserVo vo);
	
}
