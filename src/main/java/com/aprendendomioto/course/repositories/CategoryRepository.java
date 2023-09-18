package com.aprendendomioto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendomioto.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}	
