package com.duastone.stalactite.entity;
/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 23, 2016 11:27:16 PM 
 */
public class Crawl {
	
	private String _id;
	private String type;
	private long timestamp;
	private String log;
	
	@Override
	public String toString() {
		return "Crawl [_id=" + _id + ", type=" + type + ", timestamp="
				+ timestamp + ", log=" + log + "]";
	}
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	
}
