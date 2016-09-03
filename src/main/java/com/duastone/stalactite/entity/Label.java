package com.duastone.stalactite.entity;

/**
 * Madia type labels;
 * Created by Fernando on 8/24/16.
 */
public class Label {

    private String id;
    private String categoryId;
    private String value;
    private long createTime;
    private String createBy;

    @Override
    public String toString() {
        return "Label{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
