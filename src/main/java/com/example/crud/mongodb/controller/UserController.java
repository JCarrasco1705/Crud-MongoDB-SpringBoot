package com.example.crud.mongodb.controller;

import com.example.crud.mongodb.model.ResponseUserDto;
import com.example.crud.mongodb.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseUserDto finById(@PathVariable(name = "id") String id){
        return service.findById(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseUserDto save(@RequestBody ResponseUserDto request){
        return service.save(request);
    }
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable(name = "id") String id){
        service.deleteById(id);
    }
    @GetMapping("/status")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Object> status() {
        return Map.of("status", "UP");
    }

}
