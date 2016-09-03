package com.duastone.stalactite.entity;

/**
 * Web site object. For save web site.
 * Created by Fernando on 8/18/16.
 */
public class WebSite {

    private String id;
    private String name;
    private String category;
    private String url;

    @Override
    public String toString() {
        return "WebSite{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
