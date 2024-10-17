package com.ecom.product.api.api;

import com.ecom.product.api.dto.request.RequsetProductDto;
import com.ecom.product.api.dto.response.ResponseProductDto;
import com.ecom.product.api.dto.response.paginate.ResponseProductPaginate;
import com.ecom.product.api.service.ProductService;
import com.ecom.product.api.utill.StandardResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/products-service/api/v1/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping("/save")
    public ResponseEntity<StandardResponse> creatProduct(
            @RequestParam("data") String data,
            @RequestParam("image") MultipartFile image
    ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        RequsetProductDto dto = objectMapper.readValue(data, RequsetProductDto.class);
        productService.creatProduct(dto, image);
        return  new ResponseEntity<>(
                new StandardResponse(200, "Product saved ..", null),
                HttpStatus.CREATED
        );

    }
    public void updateProduct(RequsetProductDto dto, String productId);
    public ResponseProductDto fundProductById(String productId);
    public ResponseProductPaginate searchAllProduct(String searchText, int page, int size);
    public void updateImage(String imageId, MultipartFile file);
    public void deleteImage(String imageId);
}
