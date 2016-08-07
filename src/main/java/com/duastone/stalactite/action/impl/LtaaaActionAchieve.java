package com.duastone.stalactite.action.impl;

import java.util.List;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.duastone.stalactite.action.LtaaaAction;
import com.duastone.stalactite.entity.LtaaaTitle;
import com.duastone.stalactite.entity.Pager;
import com.mongodb.DBCollection;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Apr 23, 2016 4:24:34 PM 
 */
@Repository("ltaaaTitleAction")
public class LtaaaActionAchieve extends BaseActionAchieve<LtaaaTitle> implements LtaaaAction{
	
	private DBCollection getCollection() {
		return mongoTemplate.getCollection("ltaaa_titles");
	}

	@Override
	public int total() {
		long count = this.getCollection().count();
		return (int) count;
	}

	@Override
	public List<LtaaaTitle> getList(Pager pager) {
		Criteria criteria = new Criteria();
		Query query = new Query(criteria);
		query.skip(pager.getPage() * pager.getSize());
		query.limit(pager.getSize());
		List<LtaaaTitle> list = mongoTemplate.find(query, LtaaaTitle.class, "ltaaa_titles");
		return list;
	}
}
