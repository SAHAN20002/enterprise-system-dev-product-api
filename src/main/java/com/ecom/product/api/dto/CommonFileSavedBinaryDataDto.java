package com.ecom.product.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonFileSavedBinaryDataDto {
    private Blob hash;
    private Blob fileName;
    private Blob resourceUrl;
    private Blob directory;


}
