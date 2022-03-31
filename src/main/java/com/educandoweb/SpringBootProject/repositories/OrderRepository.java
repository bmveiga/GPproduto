package com.educandoweb.SpringBootProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.SpringBootProject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
