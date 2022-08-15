package com.brunocp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}