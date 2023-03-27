package com.example.crud.mongodb.service;

import com.example.crud.mongodb.model.ResponseUserDto;

public interface UserService {

    ResponseUserDto findById(String id);
    ResponseUserDto save(ResponseUserDto request);
    void deleteById(String id);
}
