package com.springboot.shoppingcart.api.repository;

import com.springboot.shoppingcart.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
