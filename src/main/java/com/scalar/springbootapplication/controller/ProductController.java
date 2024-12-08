package com.scalar.springbootapplication.controller;


import com.scalar.springbootapplication.models.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


//    @RequestMapping(value = "/products", method = RequestMethod.POST)
    @PostMapping(value = "/products")
    public  void createProduct(Product product) {

    }

    public Product getProductById(Long id) {
        return null;
    }

    public  void updateProduct(Product product) {

    }
    public  void deleteProduct(Long id) {

    }



}
