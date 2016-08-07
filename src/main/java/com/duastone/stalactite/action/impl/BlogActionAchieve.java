package com.duastone.stalactite.action.impl;

import java.util.List;

import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.duastone.stalactite.action.BlogAction;
import com.duastone.stalactite.entity.Blog;
import com.mongodb.BasicDBObject;
import com.mongodb.QueryBuilder;

import static org.springframework.data.mongodb.core.query.Query.query;
import static org.springframework.data.mongodb.core.query.Criteria.where;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Feb 21, 2016 7:49:12 PM 
 */
@Repository("blogAction")
public class BlogActionAchieve extends BaseActionAchieve<Blog> implements BlogAction{

	@Override
	public List<Blog> findTitleList() {
		BasicDBObject basicDBObject = new BasicDBObject();
		basicDBObject.put("id", 1);
		basicDBObject.put("title", 1);
		basicDBObject.put("type", 1);
		basicDBObject.put("currentDate", 1);
		QueryBuilder builder = new QueryBuilder();
		return mongoTemplate.find(new BasicQuery(builder.get(), basicDBObject), Blog.class);
	}
	
	@Override
	public void updateContent(Blog blog){
		Update update = new Update();
		update.set("content", blog.getContent());
		update.set("lastUpdateDate", blog.getLastUpdateDate());
		update.set("type", blog.getType());
		update.set("title", blog.getTitle());
		mongoTemplate.upsert(query(where("_id").is(blog.getId())), 
				update,
				Blog.class);
	}

	@Override
	public long totalCount() {
		long count = mongoTemplate.getCollection(mongoTemplate.getCollectionName(Blog.class)).count();
		return count;
	}

}
