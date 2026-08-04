package com.spring_boot_CRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot_CRUD.entity.Product;
import com.spring_boot_CRUD.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRepo;
	
	public void createProduct(String productName, String productDesc) {
		
		Product product = new Product();
		
		product.setProductName(productName);
		product.setProductDecs(productDesc);
		product.setProductPrice(500);
		
		productRepo.save(product);
		
		System.out.println("Product has been created successfully");
		

	}
	
	
}
