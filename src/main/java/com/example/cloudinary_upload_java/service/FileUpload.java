package com.example.cloudinary_upload_java.service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;


public interface FileUpload {
    public String upload(MultipartFile file) throws IOException;
}
