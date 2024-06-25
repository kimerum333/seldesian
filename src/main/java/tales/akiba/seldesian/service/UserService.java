package tales.akiba.seldesian.service;

import java.util.List;
import tales.akiba.seldesian.entity.User;

public interface UserService {

	void insertUser(User user);

	List<User> getUserList();

	void deleteUser(User user);

	User getView(User user);

	void userUpdate(User user);

}
