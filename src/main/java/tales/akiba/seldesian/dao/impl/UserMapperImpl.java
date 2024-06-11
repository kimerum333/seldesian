package tales.akiba.seldesian.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tales.akiba.seldesian.dao.UserMapper;
import tales.akiba.seldesian.vo.UserVo;

@Repository("userMapper")
public class UserMapperImpl implements UserMapper {
	
	@Autowired
	private  SqlSession sqlSession;

	@Override
	public List<UserVo> getUserList() {
		List<UserVo>  userList =  sqlSession.selectList("User.getUserList");
		return userList;
	}

	@Override
	public void insertUser(UserVo vo) {

		sqlSession.insert("User.UserInsert", vo);
		
	}

	@Override
	public void deleteUser(UserVo vo) {

		sqlSession.delete( "User.UserDelete", vo );
		
	}

	@Override
	public UserVo getUser(UserVo vo) {
		UserVo  user  =  sqlSession.selectOne("User.getUser", vo);
		
		return  user;
	}

	@Override
	public void updateUser(UserVo vo) {

		sqlSession.update("User.UserUpdate", vo);
		
	}

}
