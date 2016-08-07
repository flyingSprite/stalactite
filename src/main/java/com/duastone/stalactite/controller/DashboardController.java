package com.duastone.stalactite.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.duastone.stalactite.entity.api.Count;
import com.duastone.stalactite.service.DashboardService;

/** 
 * @author Quesle 
 * Github Quesle
 * Date Mar 1, 2016 9:50:54 PM
 */
@RestController
public class DashboardController {
	
	@Resource
	private DashboardService dashboardService;
	
	@RequestMapping(value="/dashboard/count", method=RequestMethod.GET)
	public Count get(){
		Count count;
		try {
			count = dashboardService.getCount();
		} catch (Exception e) {
			count = new Count();
		}
		return count;
	}
}
