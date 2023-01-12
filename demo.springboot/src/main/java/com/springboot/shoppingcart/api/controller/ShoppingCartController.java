package com.springboot.shoppingcart.api.controller;


import com.springboot.shoppingcart.api.entity.Product;
import com.springboot.shoppingcart.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/shopping")
public class ShoppingCartController {

    @Autowired
    private ProductService productService;


    @GetMapping("/getAllProduct")
    public ResponseEntity<List<Product>> getAllProduct() {
         List<Product> listProduct = productService.getAllProduct();
         return ResponseEntity.ok(listProduct);
    }

}
