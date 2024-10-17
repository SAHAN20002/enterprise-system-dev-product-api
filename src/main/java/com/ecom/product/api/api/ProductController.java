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
import org.springframework.web.bind.annotation.*;
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
    @PutMapping("/update/{productId}")
    public ResponseEntity<StandardResponse> updateProduct( @RequestBody RequsetProductDto dto, @PathVariable String productId){
        productService.updateProduct(dto, productId);
        return  new ResponseEntity<>(
                new StandardResponse(201, "Product updated ..", null),
                HttpStatus.CREATED
        );
    }
    @DeleteMapping("/delete/{productId}")
    public ResponseEntity<StandardResponse> deleteProduct(@PathVariable String productId){
        productService.deleteProduct(productId);
        return  new ResponseEntity<>(
                new StandardResponse(204, "Product deleted ..", null),
                HttpStatus.NO_CONTENT
        );
    }
    @GetMapping("/find-by-id/{productId}")
    public ResponseEntity<StandardResponse> fundProductById( @PathVariable String productId){

        return  new ResponseEntity<>(
                new StandardResponse(200, "Product search by id ..",  productService.fundProductById(productId)),
                HttpStatus.OK
        );
    }
    @GetMapping("/search-product")
    public ResponseEntity<StandardResponse> searchAllProduct(@RequestParam String searchText, @RequestParam int page, @RequestParam int size){

        return  new ResponseEntity<>(
                new StandardResponse(200, "Product search all ..",  productService.searchAllProduct(searchText, page, size)),
                HttpStatus.CREATED
        );
    }
    @PutMapping("/update-image/{imageId}")
    public ResponseEntity<StandardResponse> updateImage( @PathVariable  String imageId,@RequestParam("image")  MultipartFile file){
        productService.updateImage(imageId, file);
        return  new ResponseEntity<>(
                new StandardResponse(201, "Image updated..", null),
                HttpStatus.CREATED
        );
    }
    @PutMapping("/delete-image-by-id/{imageId}")
    public ResponseEntity<StandardResponse> deleteImage(@PathVariable String imageId){
        productService.deleteImage(imageId);
        return  new ResponseEntity<>(
                new StandardResponse(204, "Image deleted..", null),
                HttpStatus.NO_CONTENT
        );
    }
}
