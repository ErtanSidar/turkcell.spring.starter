package com.turkcell.spring.starter.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int id;

    @NotBlank
    @Length(min=1, max = 20)
    private String name;

    @Min(1)
    private double price;

    @Min(0)
    private int stock;
}
