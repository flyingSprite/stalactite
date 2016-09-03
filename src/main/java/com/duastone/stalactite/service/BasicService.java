package com.duastone.stalactite.service;

import com.duastone.stalactite.exception.ValueErrorException;

import java.util.List;

/**
 * Created by Fernando on 8/24/16.
 */
public interface BasicService<T> {

    public T get(String id) throws ValueErrorException;

    public void save(T t) throws ValueErrorException;

    public void update(T t) throws ValueErrorException;

    public void delete(String id) throws ValueErrorException;
}
