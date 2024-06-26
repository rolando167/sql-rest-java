package com.jpa.spring.sql_rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.spring.sql_rest.models.User;
import com.jpa.spring.sql_rest.repositories.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired private IUserRepository userRepository;

    @Override
    public List<User> listar() {
        return userRepository.findAll();
    }

    @Override
    public List<User> listarSP() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarSP'");
    }

    @Override
    public Optional<User> findById(int id) {
         return userRepository.findById(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user, int id) {
        user.setId(Long.valueOf(id));
        userRepository.save(user);
    }

    @Override
    public void delete(int id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        }
    }

}
