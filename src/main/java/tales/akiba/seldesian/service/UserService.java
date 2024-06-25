package tales.akiba.seldesian.service;

import java.util.List;

import tales.akiba.seldesian.entity.User;

public interface UserService {

	boolean insertUser(User user);

	List<User> getUserList();

	boolean deleteUser(String email);

	User getView(String email);

	void userUpdate(User user);

}
