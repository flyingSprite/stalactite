package com.duastone.stalactite.action;

import com.duastone.stalactite.entity.Message;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 20, 2016 11:13:06 PM 
 */
public interface MessageAction extends BaseAction<Message>{

	public void updateMessage(Message message);
}
