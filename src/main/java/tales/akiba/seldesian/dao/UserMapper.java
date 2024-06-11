package tales.akiba.seldesian.dao;

import java.util.List;

import tales.akiba.seldesian.vo.UserVo;


public interface UserMapper {

	public List<UserVo> getUserList();

	public void insertUser(UserVo vo);

	public void deleteUser(UserVo vo);

	public UserVo getUser(UserVo vo);

	public void updateUser(UserVo vo);

}
