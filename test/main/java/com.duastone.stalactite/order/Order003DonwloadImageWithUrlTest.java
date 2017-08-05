package com.duastone.stalactite.order;

import org.junit.Test;

import java.io.IOException;

/**
 * Order 3: Download iamge with image url testing
 * Created by Quesle on 05/08/2017.
 */
public class Order003DonwloadImageWithUrlTest {

    @Test
    public void test() {
        String imageUrl = "http://img.hb.aicdn.com/576fe24099dd9481d52ebeb503b0e17cd95183d5341e6-VUYSZv_fw658";
        String savePath = "/Users/Fernando/Develop/test";
        String saveName = "test.jpg";
        try {
            Order003DonwloadImageWithUrl.download(imageUrl, savePath, saveName);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
