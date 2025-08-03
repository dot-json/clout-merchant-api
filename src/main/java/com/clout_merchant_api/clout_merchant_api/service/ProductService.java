package com.clout_merchant_api.clout_merchant_api.service;

import com.clout_merchant_api.clout_merchant_api.entity.Product;
import com.clout_merchant_api.clout_merchant_api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(String name, String description, double price, String category) {
        if (productRepository.existsByName(name)) {
            throw new IllegalArgumentException("Product with this name already exists");
        }
        if (!productRepository.existsByCategory(category)) {
            throw new IllegalArgumentException("Category does not exist");
        }

        Product product = new Product(name, description, price, category);
        return productRepository.save(product);
    }
}
