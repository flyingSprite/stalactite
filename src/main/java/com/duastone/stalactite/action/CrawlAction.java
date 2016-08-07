package com.duastone.stalactite.action;

import org.springframework.data.mongodb.repository.Query;

import com.duastone.stalactite.entity.Crawl;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 24, 2016 10:20:39 PM 
 */
public interface CrawlAction extends BaseAction<Crawl>{
	
	@Query("")
	public long getNewestCrawl();

}
