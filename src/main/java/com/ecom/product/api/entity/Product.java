package com.ecom.product.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Product {
    @Id
    @Column(name = "product_id", length = 80,nullable = false)
    private String productId;
    @Column(name = "product_name", length = 1000)
    private String description;
    @Column(name = "unit_price",precision = 2)
    private double unitPrice;
    @Column(name = "qrt",nullable = false)
    private  int quantity;
    @Embedded
    private FileResourse fileResourse;

}
