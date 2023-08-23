package com.trust.score.digital.product.controller;

import com.trust.score.digital.product.entity.ProductEntity;
import com.trust.score.digital.product.model.Product;
import com.trust.score.digital.product.service.ProductServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class ReviewControllerTest {

    @Autowired
    private ProductServiceTest productServiceTest;

    @GetMapping("/getReviewsByProduct")
    public ResponseEntity<String> getReviewsByProduct(ProductEntity productEntity){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/getReview")
    public ResponseEntity<Product> getReview(ProductEntity productEntity){
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PostMapping("/submitReview")
    public ResponseEntity<String> productReviewSubmission(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }

    @PutMapping("/updateReview")
    public ResponseEntity<String> updateReview(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteReview")
    public ResponseEntity<String> deleteReview(ProductEntity productEntity){
        return new ResponseEntity<>(productServiceTest.saveReview(productEntity), HttpStatus.CREATED);
    }
}
