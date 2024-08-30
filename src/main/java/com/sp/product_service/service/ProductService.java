package com.sp.product_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.product_service.dao.ProductRepository;
import com.sp.product_service.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Product getProductById(Long id)
	{
		return productRepository.findById(id).get();
				
	}
	public Product addProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	public List<Product> getProducts()
	{
		return productRepository.findAll();
	}

}
