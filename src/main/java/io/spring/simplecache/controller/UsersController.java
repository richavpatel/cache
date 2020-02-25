package io.spring.simplecache.controller;

import io.spring.simplecache.model.Users;
import io.spring.simplecache.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {


    @Autowired
    UsersService userService;

    @GetMapping("/{name}")
    public Users getUserByName(@PathVariable String name){
        return userService.getUsersByName(name);
    }



}
