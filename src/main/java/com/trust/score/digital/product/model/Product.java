package com.trust.score.digital.product.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long productId;
    private long userId;
    private String productName;
    private String barCode;
}
