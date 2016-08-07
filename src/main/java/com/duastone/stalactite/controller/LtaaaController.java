package com.duastone.stalactite.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.duastone.stalactite.entity.ListValue;
import com.duastone.stalactite.entity.Pager;
import com.duastone.stalactite.service.LtaaaSerivce;

/** 
 * @author Quesle 
 * Github Quesle
 * Date Apr 23, 2016 4:48:16 PM
 */
@RestController
public class LtaaaController {
	
	@Resource
	private LtaaaSerivce ltaaaService;
	
	@RequestMapping(value="/ltaaa/total", method=RequestMethod.GET) 
	public long total() {
		return ltaaaService.total();
	}
	
	@RequestMapping(value="/ltaaa", method=RequestMethod.GET) 
	public ListValue list(Pager pager) {
		System.out.println(pager);
		return ltaaaService.list(pager);
	}
}
