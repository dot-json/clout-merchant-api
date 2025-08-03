package com.clout_merchant_api.clout_merchant_api.repository;

import com.clout_merchant_api.clout_merchant_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);
    boolean existsByName(String name);
    boolean existsByCategory(String category);
}
