package com.turkcell.spring.starter.repository;

import com.turkcell.spring.starter.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    // 1 => Derived Query Methods
    List<Product> findByName(String name);

    // 2 => JPQL Queries - SQL + JPA Working with entity name
    //@Query("SELECT p FROM Product p WHERE p.name = :name AND p.price = ?2")
    @Query("SELECT p FROM Product p WHERE p.name = ?1 AND p.price = ?2")
    List<Product> findByNameAndPrice(String name, double price);

    @Query(value = "SELECT p FROM Product p  join p.category c WHERE c.name = ?1", nativeQuery = false)
    List<Product> findByCategory(String name);

    // 3 => Native Query - Working with table names in db not entity name
    @Query(value = "SELECT * FROM product WHERE name = ?1 AND price = ?2", nativeQuery = true)
    List<Product> findByNameAndPriceNative(String name, double price);
}
