package com.duastone.stalactite.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.duastone.stalactite.entity.Message;
import com.duastone.stalactite.service.MessageService;

/** 
 * @author Quesle 
 * Github Quesle
 * Date Jul 20, 2016 11:36:03 PM
 */

@RestController
public class MessageController {
	
	@Resource
	private MessageService messageService;

	// Post a blog to server.
	@RequestMapping(value="/message", method=RequestMethod.POST)
	public Message post(@RequestBody Message message, boolean isUpdate) throws Exception{
		System.out.println(isUpdate);
		if (isUpdate) {
			this.put(message);
		} else {
			messageService.saveMessage(message);
		}
		return message;
	}
	
	@RequestMapping(value="/message", method=RequestMethod.PUT)
	public Message put(@RequestBody Message message) throws Exception{
		messageService.updateMessage(message);
		return message;
	}
}
