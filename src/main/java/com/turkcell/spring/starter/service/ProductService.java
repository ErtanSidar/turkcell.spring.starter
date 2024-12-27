package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.Product;

import java.util.List;

public interface ProductService {

    Product add(Product product);

    Product getById(int id);

    List<Product> getAll();

    void delete(int id);

    Product update(Product product);
}
