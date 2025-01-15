package com.turkcell.spring.starter.repository;

import com.turkcell.spring.starter.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
