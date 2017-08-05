package com.duastone.stalactite.taskInventory;

import com.duastone.stalactite.taskInventory.entity.Report;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * Order 4: Donwload multi images, and get the schedule.
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order004DownloadMultiImagesTest {

    @Test
    public void test() {
        String imageUrl = "http://img.hb.aicdn.com/576fe24099dd9481d52ebeb503b0e17cd95183d5341e6-VUYSZv_fw658";
        String savePath = "/Users/Fernando/Develop/test";

        Map<String, String> images = new HashMap<String, String>();
        for (int i = 0; i < 1000; i ++) {
            images.put(String.format("img_%s.jpg", i), imageUrl);
        }
        BiConsumer<String, Report> consumer = (name, report) -> {
            System.out.print(name + ": ");
            System.out.println(report);
        };
        Order004DownloadMultiImages.download(images, savePath, consumer);
    }
}
