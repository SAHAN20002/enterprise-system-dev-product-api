package com.ecom.product.api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

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
    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<Images> images;

}
