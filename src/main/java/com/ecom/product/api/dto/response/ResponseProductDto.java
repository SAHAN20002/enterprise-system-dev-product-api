package com.ecom.product.api.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseProductDto {
    private String productId;
    private String description;
    private double unitPrice;
    private int qty;
    private String imageUrl;
    private List<ResponseImage> images;
}
