package com.duastone.stalactite.service.impl;

import com.duastone.stalactite.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * File service
 * Created by Quesle on 22/11/2016.
 */
@Service("fileUpload")
public class FileServiceImpl implements FileService{

    @Override
    public void uploadFile(MultipartFile file) throws IOException{

        if (file == null) {
            throw new IOException("MultipartFile instance was null.");
        }

        // Use MultipartFile.transferTo(File file) to save file in disk.
        file.transferTo(new File("/Users/Fernando/Develop/temp/test.rp"));
    }
}
