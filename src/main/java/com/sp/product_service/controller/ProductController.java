package com.sp.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.product_service.model.Product;
import com.sp.product_service.service.ProductService;

@RestController
@RequestMapping(value = "/api1/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		return productService.addProduct(product);
	}
	
	@GetMapping()
	public List<Product> getProducts()
	{
		return productService.getProducts();
	}
	
	@GetMapping(value = "/{id}")
	public Product getProductById(@PathVariable Long id)
	{
		return productService.getProductById(id);
	}
	
}
