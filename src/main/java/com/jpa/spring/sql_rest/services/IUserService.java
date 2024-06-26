package com.jpa.spring.sql_rest.services;

import java.util.List;

import com.jpa.spring.sql_rest.models.User;

public interface IUserService {

    public List<User> listar();
    public User findById(int id);
    public void save(User user);
    public void update(User user, int id);
    public void delete(int id);
}
