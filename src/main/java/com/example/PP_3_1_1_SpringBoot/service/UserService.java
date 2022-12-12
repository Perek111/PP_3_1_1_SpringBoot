package com.example.PP_3_1_1_SpringBoot.service;

import com.example.PP_3_1_1_SpringBoot.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> findAll();

    public User findOne(long id);

    public void save(User user);
    public void update(long id, User user);

    public void delete(long id); //by id

}
