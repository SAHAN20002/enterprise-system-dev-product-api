package com.ecom.product.api.service.impl;

import com.ecom.product.api.dto.request.RequsetProductDto;
import com.ecom.product.api.dto.response.ResponseProductDto;
import com.ecom.product.api.dto.response.paginate.ResponseProductPaginate;
import com.ecom.product.api.service.ProductService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Override
    public void creatProduct(RequsetProductDto dto, MultipartFile file) {

    }

    @Override
    public void updateProduct(RequsetProductDto dto, String productId) {

    }

    @Override
    public ResponseProductDto fundProductById(String productId) {
        return null;
    }

    @Override
    public ResponseProductPaginate searchAllProduct(String searchText, int page, int size) {
        return null;
    }

    @Override
    public void updateImage(String imageId, MultipartFile file) {

    }

    @Override
    public void deleteImage(String imageId) {

    }
}
