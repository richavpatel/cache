package io.spring.simplecache.service;


import io.spring.simplecache.Repository.UsersRepository;
import io.spring.simplecache.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

   @Cacheable(value = "usersCache", key = "#name", unless ="#name != null")

    public Users getUsersByName(String name){
        System.out.println("Retrieving from Database for name: " + name);
        return usersRepository.getByName(name);
    }
}
