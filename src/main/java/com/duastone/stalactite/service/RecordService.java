package com.duastone.stalactite.service;

import java.util.List;

import com.duastone.stalactite.entity.Record;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jan 26, 2016 9:58:51 PM 
 */
public interface RecordService {

	public void saveRecord(Record record) throws Exception;
	
	public List<Record> getRecords();
	
}
