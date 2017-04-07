package com.duastone.stalactite.entity;

/**
 * WildRequest
 * Created by Quesle on 04/04/2017.
 */
public class WildRequest {

    private String name;
    private int start;
    private int count;
    private int total;
    private Object result;
    private String err;

    public WildRequest() {

    }

    public WildRequest(String err){
        this.err = err;
    }

    @Override
    public String toString() {
        return "WildRequest{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", count=" + count +
                ", total=" + total +
                ", result=" + result +
                ", err='" + err + '\'' +
                '}';
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }
}
