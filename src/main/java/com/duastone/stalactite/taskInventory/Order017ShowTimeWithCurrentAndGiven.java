package com.duastone.stalactite.taskInventory;

/**
 * Order 17: Show time with current and given.
 *
 * Created by Quesle on 09/08/2017.
 */
public class Order017ShowTimeWithCurrentAndGiven {

    public static String show(long currentTimestamp, long givenTimestamp) {
        if (currentTimestamp < givenTimestamp) {
            return "";
        }
        if (currentTimestamp - givenTimestamp < 120 * 1000) {
            return "1分钟前";
        }
        if (currentTimestamp - givenTimestamp < 60 * 60 * 1000) {
            int minute = (int) ((currentTimestamp - givenTimestamp) / 60 / 1000);
            return String.format("%d分钟前", minute);
        }
        if (currentTimestamp - givenTimestamp < 24 * 60 * 60 * 1000) {
            int hour = (int) ((currentTimestamp - givenTimestamp) / 60 / 60 / 1000);
            return String.format("%d小时前", hour);
        }
        int day = (int) ((currentTimestamp - givenTimestamp) / 24 / 60 / 60 / 1000);
        return String.format("%d天前", day);
    }
}
