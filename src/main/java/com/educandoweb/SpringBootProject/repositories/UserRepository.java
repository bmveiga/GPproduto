package com.educandoweb.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBootProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
