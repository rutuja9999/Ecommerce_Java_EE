package com.orderservice.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.orderservice.entity.Order;
import com.orderservice.exceptions.UserNotFoundException;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	public List<Order> findByUser(String user) throws UserNotFoundException;
}
