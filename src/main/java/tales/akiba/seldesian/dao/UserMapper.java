package tales.akiba.seldesian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tales.akiba.seldesian.entity.User;

@Mapper
public interface UserMapper {

    void insertUser(User user);

    List<User> getUserList();

    void deleteUser(User user);

    User getView(User user);

    void updateUser(User user);
}
 