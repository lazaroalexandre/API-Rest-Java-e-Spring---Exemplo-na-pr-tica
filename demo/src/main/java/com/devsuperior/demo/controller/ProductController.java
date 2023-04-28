package com.devsuperior.demo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.entities.Department;
import com.devsuperior.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects(){
        Department d1 = new Department();
        d1.setId(1L);
        d1.setName("Tech");
        Department d2 = new Department(2L, "Pet");

        Product p1 = new Product(1L, "MacBook", 4000, d1);
        Product p2 = new Product(2L, "MacBook Pro", 5000, d1);
        Product p3 = new Product(1L, "Pet House", 4000, d2);

        List<Product> list = Arrays.asList(p1,p2,p3);

        return list;
    }
}
