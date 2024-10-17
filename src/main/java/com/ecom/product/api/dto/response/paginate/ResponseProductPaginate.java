package com.ecom.product.api.dto.response.paginate;

import com.ecom.product.api.dto.response.ResponseProductDto;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ResponseProductPaginate {
    private long count;
    private List<ResponseProductDto> dataList;
}
