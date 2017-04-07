package com.duastone.stalactite.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * File Service
 * Created by Fernando on 22/11/2016.
 */
public interface FileService {

    public void uploadFile(MultipartFile file) throws IOException;
}
