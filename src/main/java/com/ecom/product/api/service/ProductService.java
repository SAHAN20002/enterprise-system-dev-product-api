package com.ecom.product.api.service;

import com.ecom.product.api.dto.request.RequsetProductDto;
import com.ecom.product.api.dto.response.ResponseProductDto;
import com.ecom.product.api.dto.response.paginate.ResponseProductPaginate;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    public void creatProduct(RequsetProductDto dto, MultipartFile file);
    public void updateProduct(RequsetProductDto dto, String productId);
    public ResponseProductDto fundProductById(String productId);
    public ResponseProductPaginate searchAllProduct(String searchText, int page, int size);
    public void updateImage(String imageId, MultipartFile file);
    public void deleteImage(String imageId);
}
