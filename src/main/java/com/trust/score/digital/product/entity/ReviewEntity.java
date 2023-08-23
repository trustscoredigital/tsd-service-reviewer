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
public class ReviewEntity {
    @Id
    private long reviewId;
    private long userId;
    private long productId;
    private String review;

    private String userFeeling;
    private int userRating;
}
