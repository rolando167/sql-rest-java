package com.jpa.spring.sql_rest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.spring.sql_rest.models.User;
import com.jpa.spring.sql_rest.services.IUserService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired private IUserService iUserService;

    @GetMapping("/listar")
    public List<User> listar() {
        List<User> users = iUserService.listar();
        return users;
    }

    @GetMapping("/listarsp")
    public List<User> listarsp() {
        List<User> users = iUserService.listarSP();
        return users;
    }

    @GetMapping("/find/{id}")
    public Optional<User> findById(@PathVariable int id) {
        Optional<User> user = iUserService.findById(id);
        return user;
    }

    @PostMapping("/save")
    public String save(@RequestBody User user) {
        iUserService.save(user);

        return "Usuario Creado!!";
    }

    @PutMapping("update/{id}")
    public String update(@PathVariable int id, @RequestBody User user) {
        iUserService.update(user, id);

        return "Usuario Atualizado";
    }


    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        iUserService.delete(id);
        return "Usuario Eliminado!!";
    }


}