package com.duastone.stalactite.entity;

/**
 * @author Quesle
 * Github Quesle
 * Created by Quesle on 8/9/16.
 */
public class CmsMonitor {

    private long _id;
    private String category;
    private long interTimestamp;
    private String requestId;
    private int period;
    private String userId;
    private long timestamp;
    private double minimum;
    private double maximum;
    private double average;

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getInterTimestamp() {
        return interTimestamp;
    }

    public void setInterTimestamp(long interTimestamp) {
        this.interTimestamp = interTimestamp;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
