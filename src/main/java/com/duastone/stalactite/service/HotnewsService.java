package com.duastone.stalactite.service;

import java.util.List;

import com.duastone.stalactite.entity.Hotnews;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 24, 2016 10:22:55 PM 
 */
public interface HotnewsService {
	
	/**
	 * Get hotnews count.
	 * @return count
	 */
	public int totalHotnewsService();
	
	public List<Hotnews> hotnewsList();

}
