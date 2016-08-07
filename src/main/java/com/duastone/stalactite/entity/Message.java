package com.duastone.stalactite.entity;
/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 20, 2016 11:13:49 PM 
 */
public class Message {
	
	// The blog id
	private String id;
	private String type;
	private String content;
	private String from;
	private String to;
	private long timestamp;
	private int zone;
	
	@Override
	public String toString() {
		return "Message [id=" + id + ", type=" + type + ", content=" + content
				+ ", from=" + from + ", to=" + to + ", timestamp=" + timestamp
				+ ", zone=" + zone + "]";
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getZone() {
		return zone;
	}
	public void setZone(int zone) {
		this.zone = zone;
	}
}
