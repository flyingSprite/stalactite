package com.duastone.stalactite.taskInventory;

import com.duastone.stalactite.taskInventory.entity.Report;

import java.io.IOException;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Order 4: Donwload multi images, and get the schedule.
 * If crawl a website, we can crawl many image url and save them to database.
 * When download those images, should know the schedule.
 *
 * Created by Quesle on 05/08/2017.
 */
public class Order004DownloadMultiImages {

    public static void download(Map<String, String> images, String savePath,
                                  BiConsumer<String, Report> consumer) {

        System.out.println(images.size());
        Report report = new Report(images.size());

        images.forEach((name, url) -> {
            try {
                Order003DonwloadImageWithUrl.download(url, savePath, name);
                report.setSuccess(report.getSuccess() + 1);
            } catch (IOException e) {
                report.setError(report.getError() + 1);
            } finally {
//                System.out.println(report);
                consumer.accept(name, report);
            }
        });
    }
}
