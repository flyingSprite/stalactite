package com.duastone.stalactite.service.impl;

import java.util.List;

import javax.annotation.Resource;

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
	
	@Resource
	private CrawlAction crawlAction;
	
	@Resource
	private HotnewsAction hotnewsAction;
	
	@Override
	public int totalHotnewsService() {
		return hotnewsAction.total();
	}

	@Override
	public List<Hotnews> hotnewsList() {
		long newest = crawlAction.getNewestCrawl();
		List<Hotnews> hotnews = hotnewsAction.findNewestList(newest);
		return hotnews;
	}

}
