package tales.akiba.seldesian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tales.akiba.seldesian.entity.User;

@Mapper
public interface UserMapper {
	public void insertUser(User user);

	public List<User> getUserList();

	public void updateUser(User user);

	public void deleteeUser(User user);

}
 