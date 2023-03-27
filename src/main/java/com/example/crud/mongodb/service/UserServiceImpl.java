package com.example.crud.mongodb.service;

import com.example.crud.mongodb.dao.UserDao;
import com.example.crud.mongodb.model.ResponseUserDto;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    UserDao dao;

    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }

    public ResponseUserDto findById(String id) {
        return dao.findById(id).orElse(ResponseUserDto.builder().build());
    }

    public ResponseUserDto save(ResponseUserDto request) {
        return dao.save(request);
    }

    public void deleteById(String id) {
        dao.deleteById(id);
    }

}
