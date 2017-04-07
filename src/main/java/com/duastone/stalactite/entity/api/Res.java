package com.duastone.stalactite.entity.api;

import org.springframework.http.HttpStatus;

import java.util.Objects;

/**
 * The controller response entity
 * Created by Fernando on 8/16/16.
 */
public class Res {

    private int code;
    private String message;
    private Object data;
    private HttpStatus status;

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
                ", status=" + status +
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

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
