package com.ecom.product.api.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity(name = "product_images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Images {
    @Id
    private String id;
    @Embedded
    private  FileResourse fileResourse;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
