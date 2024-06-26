package com.jpa.spring.sql_rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.spring.sql_rest.models.User;
import com.jpa.spring.sql_rest.services.IUserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired private IUserService iUserService;

    @GetMapping("/listar")
    public List<User> listar() {
       List<User> users = iUserService.listar();
        return users;
    }

    

}