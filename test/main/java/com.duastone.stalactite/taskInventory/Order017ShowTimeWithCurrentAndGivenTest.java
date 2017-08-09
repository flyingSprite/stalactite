package com.duastone.stalactite.taskInventory;

import org.junit.Test;

/**
 * Order 17: Show time with current and given testing.
 *
 * Created by Quesle on 09/08/2017.
 */
public class Order017ShowTimeWithCurrentAndGivenTest {

    @Test
    public void test() {

        String format = Order017ShowTimeWithCurrentAndGiven.show(
                System.currentTimeMillis(),
                1502294022618L
        );
        // 1分钟前
        System.out.println(format);

        String format2 = Order017ShowTimeWithCurrentAndGiven.show(
                System.currentTimeMillis(),
                1502292002618L
        );
        // 36分钟前
        System.out.println(format2);

        String format3 = Order017ShowTimeWithCurrentAndGiven.show(
                System.currentTimeMillis(),
                1502272002618L
        );
        // 6小时前
        System.out.println(format3);

        String format4 = Order017ShowTimeWithCurrentAndGiven.show(
                System.currentTimeMillis(),
                1502192022618L
        );
        // 1天前
        System.out.println(format4);

        String format5 = Order017ShowTimeWithCurrentAndGiven.show(
                System.currentTimeMillis(),
                1501294022618L
        );
        // 11天前
        System.out.println(format5);
    }
}
