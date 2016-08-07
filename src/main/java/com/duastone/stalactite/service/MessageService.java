package com.duastone.stalactite.service;

import com.duastone.stalactite.entity.Message;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 20, 2016 11:20:28 PM 
 */
public interface MessageService {
	
	public void saveMessage(Message message) throws Exception;
	
	public void updateMessage(Message message) throws Exception;
}
