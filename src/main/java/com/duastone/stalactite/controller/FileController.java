package com.duastone.stalactite.controller;

import com.duastone.stalactite.entity.api.FileUpload;
import com.duastone.stalactite.entity.api.Res;
import com.duastone.stalactite.service.FileService;
import org.aspectj.weaver.Iterators;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.Iterator;

/**
 * File Upload & Downlaod
 * Created by Quesle on 22/11/2016.
 * @author Quesle
 * @email zrwuxian@126.com
 * @github Quesle
 */
@RestController
public class FileController {

    @Resource
    private FileService fileService;

    @RequestMapping(value = "/file/upload", method = RequestMethod.POST)
    public Res upload(MultipartHttpServletRequest request) {
        Res res = new Res();
        try {
            Iterator<String> it = request.getFileNames();
            while (it.hasNext()) {
                String uploadFile = it.next();
                MultipartFile file = request.getFile(uploadFile);
                FileUpload newFile = new FileUpload(file);
                System.out.println("==============");
                System.out.println(newFile);
                fileService.uploadFile(file);
            }
        } catch (Exception e) {
            res.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        res.setStatus(HttpStatus.OK);
        return res;
    }
}
