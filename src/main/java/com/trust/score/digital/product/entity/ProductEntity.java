package com.trust.score.digital.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    private long productId;
    private long userId;
    private String productName;
    private String barCode;
}
