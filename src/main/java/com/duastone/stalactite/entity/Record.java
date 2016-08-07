package com.duastone.stalactite.entity;

import java.util.Date;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jan 23, 2016 11:33:45 PM 
 */
public class Record {
	
	// Base MongoDB id.
	private String id;
	// Record type
	private String type;
	// Record title
	private String title;
	// Record content, what you want record.
	private String content;
	// Record time when write down
	private Date currentTime;
	// Record status
	private String status;
	
	// Default toString()
	@Override
	public String toString() {
		return "Record [id=" + id + ", type=" + type + ", title=" + title
				+ ", content=" + content + ", currentTime=" + currentTime
				+ ", status=" + status + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}

