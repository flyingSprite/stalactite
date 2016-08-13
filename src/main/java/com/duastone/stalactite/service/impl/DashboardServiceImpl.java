package com.duastone.stalactite.service.impl;

import javax.annotation.Resource;

import com.duastone.stalactite.action.CmsMonitorAction;
import com.duastone.stalactite.entity.Hotnews;
import com.duastone.stalactite.service.HotnewsService;
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

    @Resource
    private HotnewsService hotnewsService;

    @Resource
    private CmsMonitorAction cmsMonitorAction;

	@Override
	public Count getCount() throws Exception {
		Count count = new Count();
		long blogCount = blogAction.totalCount();
		long ltaaaCount = ltaaaService.total();
        long hotnewsCount = hotnewsService.totalHotnewsService();
        long cmsMonitorCount = cmsMonitorAction.total();
		count.setLtaaa(ltaaaCount);
		count.setBlog(blogCount);
        count.setHotnews(hotnewsCount);
        count.setCmsMonitor(cmsMonitorCount);
		return count;
	}

}
