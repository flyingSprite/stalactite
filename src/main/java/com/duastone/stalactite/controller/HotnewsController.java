package com.duastone.stalactite.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.duastone.stalactite.entity.Hotnews;
import com.duastone.stalactite.service.HotnewsService;

/** 
 * @author Quesle 
 * Github Quesle
 * Date Jul 24, 2016 10:27:40 PM
 */
@RestController
public class HotnewsController {
	
	@Resource
	private HotnewsService hotnewsService;
	
	@RequestMapping(value="/hotnews/count", method=RequestMethod.GET)
	public int count() {
		
		return hotnewsService.totalHotnewsService();
	}
	
	@RequestMapping(value="/hotnews", method=RequestMethod.GET)
	public List<Hotnews> get(){
		return hotnewsService.hotnewsList();
	}
}
