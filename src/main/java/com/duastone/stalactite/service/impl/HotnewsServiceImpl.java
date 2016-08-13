package com.duastone.stalactite.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duastone.stalactite.action.CrawlAction;
import com.duastone.stalactite.action.HotnewsAction;
import com.duastone.stalactite.entity.Hotnews;
import com.duastone.stalactite.service.HotnewsService;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 24, 2016 10:23:11 PM 
 */
@Service("hotnewsService")
public class HotnewsServiceImpl implements HotnewsService{

    // Crawl mongodb interface
	@Resource
	private CrawlAction crawlAction;

    // Hotnews mongodb interface
	@Resource
	private HotnewsAction hotnewsAction;

    // Get count of hotnews
	@Override
	public int totalHotnewsService() {
		return hotnewsAction.total();
	}

    // Get the newest hotnews list.
	@Override
	public List<Hotnews> hotnewsList() {
        // Get newest timestamp
		long newest = crawlAction.getNewestCrawl();
        // Get newest hotnews list.
		List<Hotnews> hotnews = hotnewsAction.findNewestList(newest);
		return hotnews;
	}

}
