package com.duastone.stalactite.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.duastone.stalactite.action.MessageAction;
import com.duastone.stalactite.entity.Message;
import com.duastone.stalactite.service.MessageService;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 20, 2016 11:22:20 PM 
 */
@Service("messageService")
public class MessageServiceImpl implements MessageService{
	
	@Resource
	private MessageAction messageAction;

	@Override
	public void saveMessage(Message message) throws Exception {
		
		if (message == null || message.getContent().equals("")) {
			throw new Exception("Message info is empty.");
		}
		
		if (message.getTimestamp() == 0) {
			throw new Exception("Message date is empty.");
		}
		
		messageAction.save(message);
	}

	@Override
	public void updateMessage(Message message) throws Exception {
		System.out.println(message);
	}
		
}
