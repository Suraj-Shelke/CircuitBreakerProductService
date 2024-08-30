package com.sp.product_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.product_service.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
