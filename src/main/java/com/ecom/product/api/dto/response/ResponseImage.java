package com.ecom.product.api.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseImage {
    private String id;
    private String resourceUrl;
}
