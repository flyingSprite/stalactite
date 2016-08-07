package com.duastone.stalactite.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.duastone.stalactite.entity.Record;
import com.duastone.stalactite.service.RecordService;

/** 
 * @author Quesle 
 * Github Quesle
 * Date Jan 23, 2016 11:26:06 PM
 */
@RestController
public class RecordController {
	
	@Resource
	private RecordService recordService;
	
	@ResponseBody
	@RequestMapping(value="/record", method=RequestMethod.POST)
	public Record post( Record record) throws Exception{
		recordService.saveRecord(record);
		return record;
	}
	
	@RequestMapping(value="/record", method=RequestMethod.PUT)
	public Record put(Record record, String title){
		return record;
	}
	
	//@CrossOrigin(origins="http://localhost:9000")
	@RequestMapping(value="/record", method=RequestMethod.GET)
	public @ResponseBody List<Record> get(){
		List<Record> records = recordService.getRecords();
		return records;
	}
}

