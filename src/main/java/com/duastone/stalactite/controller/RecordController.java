package com.duastone.stalactite.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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
	@RequestMapping(
            value="/record",
            method=RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public Record post(@RequestBody Record record) throws Exception{
		recordService.saveRecord(record);
		return record;
	}
	
	@RequestMapping(
            value="/record",
            method=RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public Record put(@RequestBody Record record, String title){
		return record;
	}
	
	//@CrossOrigin(origins="http://localhost:9000")
	@RequestMapping(value="/record", method=RequestMethod.GET)
	public @ResponseBody List<Record> get(){
		List<Record> records = recordService.getRecords();
		return records;
	}
}
