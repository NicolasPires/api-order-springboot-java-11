package com.nksolucoes.apiorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nksolucoes.apiorder.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
		
}
