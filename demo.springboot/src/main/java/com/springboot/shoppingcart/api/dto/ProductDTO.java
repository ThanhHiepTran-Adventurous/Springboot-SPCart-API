package com.springboot.shoppingcart.api.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Long id;

    private String nameProduct;

    private int availableQuantityProduct;

    private float priceProduct;

}
