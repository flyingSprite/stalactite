package com.duastone.stalactite.entity;

import java.util.Date;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Feb 8, 2016 10:02:50 PM 
 */
public class Blog {
	
	// The blog id
	private String id;
	// The blog title.
	private String title;
	// The blog author
	private String author;
	// The blog type.
	private String type;
	// The blog content
	private String content;
	// The blog create date.
	private Date currentDate;
	// THe blog last update date
	private Date lastUpdateDate;
	
	public Blog(){
		
	}
	
	public Blog(String title, String content){
		this.title = title;
		this.content = content;
		this.currentDate = new Date();
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", author=" + author
				+ ", type=" + type + ", content=" + content + ", currentDate="
				+ currentDate + ", lastUpdateDate=" + lastUpdateDate + "]";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
}
