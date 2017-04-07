package com.duastone.stalactite.entity.api;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.IOException;
import java.io.InputStream;

/**
 * File Upload Entity
 * Created by Quesle on 22/11/2016.
 */
public class FileUpload {

    private String filename;
    private String mimeType;
    private InputStream fileStream;

    public FileUpload() {

    }

    public FileUpload(MultipartFile multipartFile) {
        try {
            this.filename = multipartFile.getOriginalFilename();
            this.mimeType = multipartFile.getContentType();
            this.fileStream = multipartFile.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "FileUpload{" +
                "filename='" + filename + '\'' +
                ", mimeType='" + mimeType + '\'' +
                ", fileStream=" + fileStream +
                '}';
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public InputStream getFileStream() {
        return fileStream;
    }

    public void setFileStream(InputStream fileStream) {
        this.fileStream = fileStream;
    }
}
