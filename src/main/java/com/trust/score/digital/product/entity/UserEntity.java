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
public class UserEntity {
    @Id
    private long userId;
    private String userName;
    private String email;
    private String mobileNumber;
    private String address;
    private String zipCode;
}
