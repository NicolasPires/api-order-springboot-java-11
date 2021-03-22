package com.nksolucoes.apiorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nksolucoes.apiorder.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
		
}
