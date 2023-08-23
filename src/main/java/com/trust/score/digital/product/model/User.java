package com.trust.score.digital.product.model;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long userId;
    private String userName;
    private String email;
    private String mobileNumber;
    private String address;
    private String zipCode;
}
