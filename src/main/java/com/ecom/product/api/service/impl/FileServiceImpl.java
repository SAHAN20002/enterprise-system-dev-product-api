package com.ecom.product.api.service.impl;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.ecom.product.api.dto.CommonFileSavedBinaryDataDto;
import com.ecom.product.api.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final AmazonS3 amazonS3;
    private final AmazonS3Client amazonS3Client;
    @Override
    public CommonFileSavedBinaryDataDto create(MultipartFile file, String directory, String bucket) throws IOException {
        String originalFileName = file.getOriginalFilename();
        String newFileName = UUID.randomUUID()+"_"+originalFileName;
        amazonS3Client.putObject(
                new PutObjectRequest(bucket,directory+newFileName,file.getInputStream(),new ObjectMetadata()).withCannedAcl(CannedAccessControlList.PublicRead)
        );
    }

    @Override
    public void delete(String directory, String fileName, String bucket) {

    }
}
