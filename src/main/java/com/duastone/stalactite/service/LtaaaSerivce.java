package com.duastone.stalactite.service;

import com.duastone.stalactite.entity.ListValue;
import com.duastone.stalactite.entity.Pager;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Apr 23, 2016 4:45:57 PM 
 */
public interface LtaaaSerivce {

	public long total();
	
	public ListValue list(Pager pager);
}
