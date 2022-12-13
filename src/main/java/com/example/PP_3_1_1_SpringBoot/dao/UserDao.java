package com.example.PP_3_1_1_SpringBoot.dao;


import com.example.PP_3_1_1_SpringBoot.models.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();

    public User findById(long id);

    public void save(User user);

    public void update(User user);

    public void deleteById(long id); //by id

}
