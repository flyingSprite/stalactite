package com.duastone.stalactite.entity;

/**
 * Document System:
 * If want to create a document, must be create one doc subject at first.
 *
 * Created by Fernando on 9/4/16.
 */
public class DocSubject {

    // MongoDB auto id.
    private String id;
    // Doc Subject type.
    private String type;
    // The title size under this subject
    private int size;
    // The subject create author.
    private String author;
    // The subject name.
    private String name;
    // Create time, current time mullis.
    private long createTime;
    // Update time, current time mullis.
    private long updateTime;

    @Override
    public String toString() {
        return "DocSubject{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
