package com.nksolucoes.apiorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nksolucoes.apiorder.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
		
}
