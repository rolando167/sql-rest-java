package com.jpa.spring.sql_rest.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.spring.sql_rest.models.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
    
}
