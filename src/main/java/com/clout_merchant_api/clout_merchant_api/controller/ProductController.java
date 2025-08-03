package com.clout_merchant_api.clout_merchant_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @RequestMapping("/get")
    public String getProducts() {
        return "List of products";
    }
}
