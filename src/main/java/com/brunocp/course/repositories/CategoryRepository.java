package com.brunocp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}