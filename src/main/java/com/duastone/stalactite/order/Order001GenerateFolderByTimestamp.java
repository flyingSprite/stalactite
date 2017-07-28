package com.duastone.stalactite.order;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

/**
 * Order 1: Generate folder by timestamp
 * For uploading file, should auto create folder to save the uploaded file.
 *
 * Created by Quesle on 28/07/2017.
 */
@SuppressWarnings("all")
public class Order001GenerateFolderByTimestamp {

    /**
     * Create folder by year
     * @param rootDir   Root folder path.
     * @param timestamp Timestamp.
     * @return Created folder path.
     */
    public static String generateByYear(String rootDir, long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);

        String folderPath = String.format("%d", calendar.get(Calendar.YEAR));
        return generateFolder(rootDir, folderPath);
    }

    /**
     * Create folder by year/month
     * @param rootDir   Root folder path.
     * @param timestamp Timestamp.
     * @return Created folder path.
     */
    public static String generateByMonth(String rootDir, long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);

        String folderPath = String.format(
                "%d%s%d",
                calendar.get(Calendar.YEAR),
                File.separator,
                calendar.get(Calendar.MONDAY)
        );
        return generateFolder(rootDir, folderPath);
    }

    /**
     * Create folder by year/month/date
     * @param rootDir   Root folder path.
     * @param timestamp Timestamp.
     * @return Created folder path.
     */
    public static String generateByDate(String rootDir, long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp);
        String folderPath = String.format(
                "%d%s%d%s%d",
                calendar.get(Calendar.YEAR),
                File.separator,
                calendar.get(Calendar.MONDAY),
                File.separator,
                calendar.get(Calendar.DATE)
        );
        return generateFolder(rootDir, folderPath);
    }

    /**
     * Generate folder by rootDir and folderDir.
     * @param rootDir   Root folder path.
     * @param folderDir Destination folder path.
     */
    private static String generateFolder(String rootDir, String folderDir) {
        File rootFile = new File(rootDir);
        File folderFile = new File(rootFile, folderDir);
        if (!folderFile.exists()) {
            folderFile.mkdirs();
        }
        return folderFile.getPath();
    }
}
