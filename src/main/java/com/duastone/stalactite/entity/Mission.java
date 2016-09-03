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
	private String title;
	private String type;
	private String author;
	private String reaper;
	private String status;
	private long createDate;
	private long startDate;
	private long endDate;

    @Override
    public String toString() {
        return "Mission{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", reaper='" + reaper + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }
}
