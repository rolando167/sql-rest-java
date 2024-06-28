package com.jpa.spring.sql_rest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.spring.sql_rest.models.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{
    @Query(value = "EXEC REPORTS.SP_listarUsers", nativeQuery = true)
    List<User> listarUserSP(@Param("page_id") Long page_id);
}
