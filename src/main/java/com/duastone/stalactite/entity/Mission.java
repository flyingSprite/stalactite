package com.duastone.stalactite.entity;

import java.util.Date;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Feb 23, 2016 11:00:48 PM 
 */
public class Mission {
	
	private String id;
	private String content;
	private String type;
	private String missionType;
	private String auther;
	private String reaper;
	private String status;
	private Date createDate;
	private Date startDate;
	private Date endDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMissionType() {
		return missionType;
	}
	public void setMissionType(String missionType) {
		this.missionType = missionType;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getReaper() {
		return reaper;
	}
	public void setReaper(String reaper) {
		this.reaper = reaper;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
