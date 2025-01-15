package com.turkcell.spring.starter.controller;

import com.turkcell.spring.starter.entity.Product;
import com.turkcell.spring.starter.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    private ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable int id) {
        return productService.getById(id);
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping
    public Product add(@RequestBody Product product) {
        return productService.add(product);
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id) {
        return "Silindi ?? Bulunamadı";
    }

    @PutMapping()
    public Product update(@RequestBody Product product) {
        return product;
    }
}
