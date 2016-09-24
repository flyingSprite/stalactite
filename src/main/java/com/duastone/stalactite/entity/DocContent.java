package com.duastone.stalactite.entity;

/**
 * One doc's detail content.
 * The content uses markdown syntax.
 * Created by Fernando on 9/4/16.
 */
public class DocContent {

    // MongoDB auto id
    private String id;
    // Doc Subject id, used delete one subject.
    private String subjectId;
    // Title Id, use query doc content.
    private String titleId;
    // Doc content's title
    private String title;
    // One title one content.
    private String content;
    // The content create author.
    private String author;
    // Create time, current time mullis.
    private long createTime;
    // Update time, current time mullis.
    private long updateTime;

    @Override
    public String toString() {
        return "DocContent{" +
                "id='" + id + '\'' +
                ", subjectId='" + subjectId + '\'' +
                ", titleId='" + titleId + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
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

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
