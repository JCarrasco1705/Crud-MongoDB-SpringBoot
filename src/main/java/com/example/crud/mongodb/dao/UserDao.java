package com.example.crud.mongodb.dao;

import com.example.crud.mongodb.model.ResponseUserDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDao extends MongoRepository <ResponseUserDto, String>{
}
