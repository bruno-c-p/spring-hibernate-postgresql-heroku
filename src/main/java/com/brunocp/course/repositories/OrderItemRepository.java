package com.brunocp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunocp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}