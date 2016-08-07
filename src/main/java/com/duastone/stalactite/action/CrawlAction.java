package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.Crawl;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 24, 2016 10:20:39 PM 
 */
public interface CrawlAction extends BaseAction<Crawl>{
	
	public long getNewestCrawl();

}
