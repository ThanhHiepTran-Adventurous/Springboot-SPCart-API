package com.springboot.shoppingcart.api.service.impl;

import com.springboot.shoppingcart.api.entity.Product;
import com.springboot.shoppingcart.api.repository.ProductRepository;
import com.springboot.shoppingcart.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    //getAllClass
    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }
}
