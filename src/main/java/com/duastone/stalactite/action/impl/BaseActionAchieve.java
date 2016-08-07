package com.duastone.stalactite.action.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import com.duastone.stalactite.action.BaseAction;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jan 24, 2016 11:51:48 PM 
 */
@Repository("baseAction")
public class BaseActionAchieve<T> implements BaseAction<T>{
	
	@Autowired
	public MongoTemplate mongoTemplate;
	
	@Override
	public void save(T o){
		mongoTemplate.save(o);
	}
	
	@Override
	public void save(T o, String collectionName) {
		mongoTemplate.save(o, collectionName);
	}
	
	@Override
	public void insert(T o){
		mongoTemplate.insert(o);
	}

	@Override
	public void insert(T o, String collectionName) {
		mongoTemplate.insert(o, collectionName);
	}

	@Override
	public List<T> findAll(Class<T> classObj) {
		return mongoTemplate.findAll(classObj);
	}
	
	@Override
	public T find(Class<T> classObj, String id){
		System.out.println(id);
		List<T> ts = mongoTemplate.find(query(where("_id").is(id)), classObj);
		if(ts != null && ts.size() > 0){
			return ts.get(0);
		}
		return null;
	}
	
	@Override
	public void remove(T o){
		mongoTemplate.remove(o);
	}
	
	@Override
	public void remove(T o, String collectionName){
		mongoTemplate.remove(o, collectionName);
	}
	
	@Override
	public List<T> findAll(Class<T> classObj, String collectionName) {
		return mongoTemplate.findAll(classObj, collectionName);
	}
	
	@Override
	public void dropCollection(Class<T> classObj) {
		mongoTemplate.dropCollection(classObj);
	}
	
	@Override
	public void dropCollection(String collectionName){
		mongoTemplate.dropCollection(collectionName);
	}

}