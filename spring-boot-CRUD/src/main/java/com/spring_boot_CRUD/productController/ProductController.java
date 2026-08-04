package com.spring_boot_CRUD.productController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_CRUD.request.body.ProductRequestBody;
import com.spring_boot_CRUD.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/createProduct")
	public void createProduct(@RequestBody ProductRequestBody req) {
		
		
		productService.createProduct(req.getProductName(), req.getProductDesc());
		
		
	}

}
