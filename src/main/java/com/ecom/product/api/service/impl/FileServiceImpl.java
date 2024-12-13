package com.ecom.product.api.service.impl;

import com.ecom.product.api.dto.CommonFileSavedBinaryDataDto;
import com.ecom.product.api.service.FileService;
import org.springframework.web.multipart.MultipartFile;

public class FileServiceImpl implements FileService {
    @Override
    public CommonFileSavedBinaryDataDto create(MultipartFile file, String directory, String bucket) {
        return null;
    }

    @Override
    public void delete(String directory, String fileName, String bucket) {

    }
}
