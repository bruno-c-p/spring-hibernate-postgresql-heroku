package com.brunocp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}