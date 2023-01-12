package com.springboot.shoppingcart.api.service.impl;

import com.springboot.shoppingcart.api.dto.ProductResponse;
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

    @Override
    public ProductResponse getAllProduct() {
        return null;
    }


    //getAllClass

}
