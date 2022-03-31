package com.educandoweb.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBootProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
