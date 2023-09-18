package com.aprendendomioto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendomioto.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}	
