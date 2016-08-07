package com.duastone.stalactite.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duastone.stalactite.action.BlogAction;
import com.duastone.stalactite.entity.api.Count;
import com.duastone.stalactite.service.DashboardService;
import com.duastone.stalactite.service.LtaaaSerivce;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Mar 1, 2016 9:53:47 PM 
 */
@Service("dashboardService")
public class DashboardServiceImpl implements DashboardService{
	
	@Resource
	private BlogAction blogAction;
	
	@Resource
	private LtaaaSerivce ltaaaService;

	@Override
	public Count getCount() throws Exception {
		Count count = new Count();
		long blogCount = blogAction.totalCount();
		long ltaaaCount = ltaaaService.total();
		count.setLtaaa(ltaaaCount);
		count.setBlog(blogCount);
		return count;
	}

}
