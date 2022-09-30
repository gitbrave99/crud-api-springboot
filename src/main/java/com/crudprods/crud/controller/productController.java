package com.crudprods.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.crudprods.crud.service.ProductService;


@RestControllerAdvice
@RequestMapping("/products")
public class productController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ResponseEntity<?> test(){

        if (this.productService.getListProducts().isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No products");
        }

        return ResponseEntity.status(HttpStatus.OK).body(productService.getListProducts());
    }
    
}
