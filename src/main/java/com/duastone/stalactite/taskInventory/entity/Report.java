package com.duastone.stalactite.taskInventory.entity;

/**
 * For Order 4, wo need a report class, to show statistic info.
 * Created by Quesle on 05/08/2017.
 */
public class Report {

    private int success;
    private int error;
    private int total;

    public Report() {

    }

    public Report(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Report{" +
                "success=" + success +
                ", error=" + error +
                ", total=" + total +
                '}';
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
