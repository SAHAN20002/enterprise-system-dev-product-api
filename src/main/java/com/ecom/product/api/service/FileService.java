package com.ecom.product.api.service;

import com.ecom.product.api.dto.CommonFileSavedBinaryDataDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FileService {
    public CommonFileSavedBinaryDataDto create(MultipartFile file,String directory ,String bucket);
    public void delete(String directory,String fileName ,String bucket);
}
