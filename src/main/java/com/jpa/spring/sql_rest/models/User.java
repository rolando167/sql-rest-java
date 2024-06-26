package com.jpa.spring.sql_rest.models;
import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;
    public String name;
    public String last_name;
    public String email;
    public String password;
    public Integer status;
    public Integer updated_by;

    @CreationTimestamp
	@Column(name="created_at", nullable=false, updatable=false)
	private Date createdAt;

	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
}
