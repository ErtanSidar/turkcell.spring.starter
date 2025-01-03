package com.turkcell.spring.starter.service;

import com.turkcell.spring.starter.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductService productService;
    private List<Product> products;

    public ProductServiceImpl(ProductService productService) {
        this.products = new ArrayList<>();
        this.productService = productService;
    }

    @Override
    public Product getById(int id) {
        return products
                .stream()
                .filter(product-> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }


    @Override
    public Product add(Product product) {
        Product product1 = products
                .stream()
                .filter(p -> p.getName().equals(product.getName())).findAny()
                .orElse(null);

        if(product1 != null) {
            throw new RuntimeException("Product already exists");
        }

        Random random = new Random();
        product.setId(random.nextInt(1000));
        products.add(product);


        return product;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product update(Product product) {
        return null;
    }
}
