package Java_mentor_Spring_Boot.demo.dao;


import Java_mentor_Spring_Boot.demo.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    User findUserByName(String email);
    User findUser(Long id);
    List<User> listUsers();
    void deleteUser(Long id);
    void updateUser(User user);
}
