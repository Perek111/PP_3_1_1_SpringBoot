package com.example.PP_3_1_1_SpringBoot.service;

import com.example.PP_3_1_1_SpringBoot.models.User;
import com.example.PP_3_1_1_SpringBoot.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl (UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public User findOne(long id) {
        return usersRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(User user) {
        usersRepository.save(user);
    }

    @Override
    @Transactional
    public void update(long id, User user) {
        user.setId(id);
        usersRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(long id) {
        usersRepository.deleteById(id);
    }

}
