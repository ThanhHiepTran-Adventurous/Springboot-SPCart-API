package com.springboot.shoppingcart.api.service;

import com.springboot.shoppingcart.api.dto.ProductResponse;
import com.springboot.shoppingcart.api.entity.Product;

import java.util.List;

public interface ProductService {

    ProductResponse getAllProduct();

}
