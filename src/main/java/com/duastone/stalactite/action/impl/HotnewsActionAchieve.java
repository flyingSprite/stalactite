package com.duastone.stalactite.action.impl;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.duastone.stalactite.action.HotnewsAction;
import com.duastone.stalactite.entity.Hotnews;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 23, 2016 11:22:35 PM 
 */
@Repository("hotnewsAction")
public class HotnewsActionAchieve extends BaseActionAchieve<Hotnews> implements HotnewsAction{

	@Override
	public List<Hotnews> findNewestList(long newest) {
		List<Hotnews> hotnews = mongoTemplate.find(
			query(where("amendTimestamp").is(newest)),
			Hotnews.class
		);
		return hotnews;
	}
	
	@Override
	public int total() {
		long count = this.mongoTemplate.getCollection("hotnews").count();
		return (int) count;
	} 

}
