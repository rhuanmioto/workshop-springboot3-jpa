package com.aprendendomioto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendomioto.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}	
