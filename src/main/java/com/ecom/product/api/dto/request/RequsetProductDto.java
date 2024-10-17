package com.ecom.product.api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RequsetProductDto {
    private String description;
    private double unitPrice;
    private int qty;
}
