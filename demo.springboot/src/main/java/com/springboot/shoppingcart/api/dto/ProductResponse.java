package com.springboot.shoppingcart.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProductResponse {
    private String status;
    private String message;
    private Pagination pagination;
    private List<ProductDTO> data;
}
