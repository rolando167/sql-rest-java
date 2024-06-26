package com.jpa.spring.sql_rest.services;

import java.util.List;
import java.util.Optional;

import com.jpa.spring.sql_rest.models.User;

public interface IUserService {

    public List<User> listar();
    public List<User> listarSP();
    public Optional<User> findById(int id);
    public void save(User user);
    public void update(User user, int id);
    public void delete(int id);
}
