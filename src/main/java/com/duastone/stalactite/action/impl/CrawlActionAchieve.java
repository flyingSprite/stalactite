package com.duastone.stalactite.action.impl;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Repository;

import com.duastone.stalactite.action.CrawlAction;
import com.duastone.stalactite.entity.Crawl;

import static org.springframework.data.mongodb.core.query.Query.query;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 24, 2016 10:20:48 PM 
 */
@Repository("crawlAction")
public class CrawlActionAchieve extends BaseActionAchieve<Crawl> implements CrawlAction{
	
	@Override
	public long getNewestCrawl() {
		Sort sort = new Sort(Sort.Direction.DESC, "timestamp");
		Crawl crawl = mongoTemplate.findOne(query(new Criteria()).with(sort).limit(1), Crawl.class);
		if (crawl != null) {
			return crawl.getTimestamp();
		}
		return 0;
	}

}
