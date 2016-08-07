package com.duastone.stalactite.exception;

/**
 * The object is error format and not support value.
 * Will show this exception.
 * Created by Fernando on 8/7/16.
 */
public class ValueErrorException extends Exception{

    public ValueErrorException() {
        super();
    }

    public ValueErrorException(String message) {
        super(message);
    }
}
