package com.trust.score.digital.product.controller;

import com.trust.score.digital.product.entity.ProductEntity;
import com.trust.score.digital.product.model.Product;
import com.trust.score.digital.product.service.ProductServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class ProductControllerTest {

    @Autowired
    private ProductServiceTest productServiceTest;

    @GetMapping("/getAllProductsByUser")
    public ResponseEntity<Product> getAllProductsByUser(ProductEntity productEntity){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/getProduct")
    public ResponseEntity<Product> getProduct(ProductEntity productEntity){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PostMapping("/createProduct")
    public ResponseEntity<String> createProduct(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<String> updateProduct(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteProduct")
    public ResponseEntity<String> deleteProduct(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }
}
