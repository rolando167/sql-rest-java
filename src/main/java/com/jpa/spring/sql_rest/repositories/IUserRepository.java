package com.jpa.spring.sql_rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.spring.sql_rest.models.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
