package com.duastone.stalactite.entity;

/**
 * Media type category
 * Created by Fernando on 8/24/16.
 */
public class Category {

    private String id;
    private String value;
    private String createBy;
    private long createTime;

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
}
