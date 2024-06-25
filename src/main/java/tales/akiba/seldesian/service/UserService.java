package tales.akiba.seldesian.service;
 
import java.util.List;

import tales.akiba.seldesian.entity.User;

public interface UserService {

	List<User> getUserList();
	
	User getView(User user);

	void insertUser(User user);

	void deleteUser(User user);

	void updateUser(User user);

}
