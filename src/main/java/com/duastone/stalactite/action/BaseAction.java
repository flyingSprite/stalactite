package com.duastone.stalactite.action;

import java.util.List;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jan 24, 2016 11:52:13 PM 
 */
public interface BaseAction<T> {
	
	public void save(T o);
	public void save(T o, String collectionName);
	
	public void insert(T o);
	public void insert(T o, String collectionName);
	
	public void remove(T o);
	public void remove(T o, String collectionName);

    // Remove entry by id.
    public void removeById(String id, Class<T> o);
	
	public List<T> findAll(Class<T> classObj);
	public List<T> findAll(Class<T> classObj, String collectionName);
	
	public T find(Class<T> classObj, String id);
	
	public void dropCollection(Class<T> classObj);
	public void dropCollection(String collectionName);
	
	/*
	public void addToSet(String key, T o);
	public void inc(String key, Number inc);
	public void pop(String key, Position position);
	public void pull(String key, T o);
	public void pullAll(String key, T[] os);
	public void push(String key, T o);
	public void pushAll(String key, T[] os);
	public void rename(String oldName, String newName);
	public void set(String key, T o);
	public void unset(String key);
	
	*/
}

