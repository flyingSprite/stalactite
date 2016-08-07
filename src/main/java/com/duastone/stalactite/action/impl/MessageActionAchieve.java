package com.duastone.stalactite.action.impl;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.duastone.stalactite.action.MessageAction;
import com.duastone.stalactite.entity.Message;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 20, 2016 11:18:37 PM 
 */
@Repository("messageAction")
public class MessageActionAchieve extends BaseActionAchieve<Message> implements MessageAction{
	
	@Override
	public void updateMessage(Message message) {
		Update update = new Update();
		update.set("content", message.getContent());
		update.set("timestamp", message.getTimestamp());
		update.set("zone", message.getZone());
		update.set("from", message.getFrom());
		update.set("to", message.getTo());
		update.set("type", message.getType());
		
		mongoTemplate.upsert(query(where("_id").is(message.getId())), 
				update,
				Message.class);
	}

}
