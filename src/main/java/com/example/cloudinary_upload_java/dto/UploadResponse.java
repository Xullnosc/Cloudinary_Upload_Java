package com.example.cloudinary_upload_java.dto;

public class UploadResponse {
    private String fileUrl;
    private String message;

    public UploadResponse(String fileUrl, String message) {
        this.fileUrl = fileUrl;
        this.message = message;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public String getMessage() {
        return message;
    }
}
