package com.trust.score.digital.product.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    private long reviewId;
    private long userId;
    private long productId;
    private String review;

    private String userFeeling;
    private int userRating;
}
