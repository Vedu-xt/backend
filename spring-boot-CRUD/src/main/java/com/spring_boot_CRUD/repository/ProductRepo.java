package com.spring_boot_CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_boot_CRUD.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
	
}
