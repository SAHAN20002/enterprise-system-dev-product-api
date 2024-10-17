package com.ecom.product.api.utill;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StandardResponse {
    private int code;
    private String message;
    private Object data;
}
