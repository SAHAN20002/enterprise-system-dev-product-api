package com.ecom.product.api.service;

import com.ecom.product.api.dto.CommonFileSavedBinaryDataDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


public interface FileService {
    public CommonFileSavedBinaryDataDto create(MultipartFile file,String directory ,String bucket) throws IOException;
    public void delete(String directory,String fileName ,String bucket);
}
