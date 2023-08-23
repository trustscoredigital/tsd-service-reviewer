package com.trust.score.digital.product.controller;

import com.trust.score.digital.product.entity.ProductEntity;
import com.trust.score.digital.product.model.Product;
import com.trust.score.digital.product.service.ProductServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class UserControllerTest {

    @Autowired
    private ProductServiceTest productServiceTest;

    @GetMapping("/getAllUsersByProduct")
    public ResponseEntity<String> getAllUsersByProduct(ProductEntity productEntity){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/getUser")
    public ResponseEntity<Product> getUser(ProductEntity productEntity){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<String> updateUser(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }
}
