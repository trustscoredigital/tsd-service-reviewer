package com.trust.score.digital.product.service;

import com.trust.score.digital.product.entity.ProductEntity;
import com.trust.score.digital.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceTest {
    @Autowired
    private ProductRepository productRepository;

    public String saveReview(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return "Your Review Has been Submitted Successfully!!";
    }
}
