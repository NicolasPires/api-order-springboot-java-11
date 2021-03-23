package com.nksolucoes.apiorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nksolucoes.apiorder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
		
}
