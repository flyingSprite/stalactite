package com.duastone.stalactite.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.duastone.stalactite.action.BaseAction;
import com.duastone.stalactite.entity.Record;
import com.duastone.stalactite.service.RecordService;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jan 26, 2016 9:59:10 PM 
 */
@Service("recordService")
public class RecordServiceImpl implements RecordService{
	@Resource
	private BaseAction<Record> baseAction;

	@Override
	public void saveRecord(Record record) throws Exception{
		if(record == null){
			throw new Exception("Record is null.");
		}
		
		if(StringUtils.isBlank(record.getTitle())){
			throw new Exception("Record title is null.");
		}
		
		if(StringUtils.isBlank(record.getContent())){
			throw new Exception("Record content is null.");
		}
		
		record.setCurrentTime(new Date());
		baseAction.save(record);
	}

	@Override
	public List<Record> getRecords() {
		return baseAction.findAll(Record.class);
	}
	
}
