package com.example.PP_3_1_1_SpringBoot.dao;


import com.example.PP_3_1_1_SpringBoot.models.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void addUser(User user);

    public User getUser(long id);

    public void editUser(User user);

    public void deleteUser(long id); //by id

    public void deleteUser(User user); //by object

}
