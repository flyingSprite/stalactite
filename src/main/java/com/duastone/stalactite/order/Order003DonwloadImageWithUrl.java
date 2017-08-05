package com.duastone.stalactite.order;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Order 3: Download iamge with image url
 * For internet crawl spider, donwload image is necessary. So Write a function to deel it.
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order003DonwloadImageWithUrl {

    public static void download(String imageUrl, String savePath, String saveName)
        throws IOException{

        URL url = new URL(imageUrl);
        URLConnection connection = url.openConnection();
        InputStream stream = connection.getInputStream();
        FileUtils.copyInputStreamToFile(stream, new File(savePath, saveName));
    }
}
