package ru.kata.spring.boot_security.demo.configs.service;



import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getListUsers();

    void deleteUser(Long id);

    void updateUser(User user);
    User getUser(Long id);
    User findByUsername(String username);
}
