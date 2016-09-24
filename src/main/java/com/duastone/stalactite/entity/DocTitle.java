package com.duastone.stalactite.entity;

/**
 * Every doc title must under one doc subject.
 * And doc title must deplay level.
 * Created by Fernando on 9/4/16.
 */
public class DocTitle {

    // MongoDB auto Id.
    private String id;
    // The doc subject id.
    private String subjectId;
    // The doc title name.
    private String title;
    // Create doc title author.
    private String author;
    // Parent doc title id, default root.
    private String parentId = "root";
    // Create time, current time mullis.
    private long createTime;
    // Update time, current time mullis.
    private long updateTime;

    @Override
    public String toString() {
        return "DocTitle{" +
                "id='" + id + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", parentId='" + parentId + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
}
