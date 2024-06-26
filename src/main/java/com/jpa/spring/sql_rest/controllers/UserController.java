package com.jpa.spring.sql_rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/listar")
    public String listar() {
        return " hola 💃";
    }

}