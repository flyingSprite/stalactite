package com.duastone.stalactite.taskInventory;

import org.junit.Test;

/**
 * Test Order 1
 * Created by Quesle on 28/07/2017.
 */
public class Order001GenerateFolderByTimestampTest {

    @Test
    public void test() {
        String yearFolder = Order001GenerateFolderByTimestamp.generateByYear(
                "/Users/Fernando/Develop/test",
                System.currentTimeMillis()
        );

        String monthFolder = Order001GenerateFolderByTimestamp.generateByMonth(
                "/Users/Fernando/Develop/test",
                System.currentTimeMillis()
        );

        String dateFolder = Order001GenerateFolderByTimestamp.generateByDate(
                "/Users/Fernando/Develop/test",
                System.currentTimeMillis()
        );

        System.out.println(yearFolder);
        System.out.println(monthFolder);
        System.out.println(dateFolder);
    }
}
