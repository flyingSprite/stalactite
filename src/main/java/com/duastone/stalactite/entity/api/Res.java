package com.duastone.stalactite.entity.api;

import java.util.Objects;

/**
 * The controller response entity
 * Created by Fernando on 8/16/16.
 */
public class Res {

    private int code;
    private String message;
    private Object data;

    public Res() {

    }

    public Res(int code) {
        this.setCode(code);
    }

    public Res(int code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public Res(int code, String message, Object data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    @Override
    public String toString() {
        return "Res{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
