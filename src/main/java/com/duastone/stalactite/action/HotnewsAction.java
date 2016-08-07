package com.duastone.stalactite.action;

import java.util.List;

import com.duastone.stalactite.entity.Hotnews;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 23, 2016 11:19:53 PM 
 */
public interface HotnewsAction extends BaseAction<Hotnews>{
	
	public int total();
	
	public List<Hotnews> findNewestList(long newest);
}
