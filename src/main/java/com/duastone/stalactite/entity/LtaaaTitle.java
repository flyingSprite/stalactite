package com.duastone.stalactite.entity;
/** 
 * @author Quesle 
 * Github Quesle 
 * Date Apr 23, 2016 4:32:31 PM 
 */
public class LtaaaTitle {

	private String flag;
	private String title;
	private String url;

	private String pic;
	private String content;

	private String create_date;
	private String search_times;
	private String comments;

	private String author_href;
	private String author_name;

	private double spider_index;

	@Override
	public String toString() {
		return "LtassTitle [flag=" + flag + ", title=" + title + ", url=" + url
				+ ", pic=" + pic + ", content=" + content + ", create_date="
				+ create_date + ", search_times=" + search_times
				+ ", comments=" + comments + ", author_href=" + author_href
				+ ", author_name=" + author_name + ", spider_index="
				+ spider_index + "]";
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getSearch_times() {
		return search_times;
	}

	public void setSearch_times(String search_times) {
		this.search_times = search_times;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getAuthor_href() {
		return author_href;
	}

	public void setAuthor_href(String author_href) {
		this.author_href = author_href;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public double getSpider_index() {
		return spider_index;
	}

	public void setSpider_index(double spider_index) {
		this.spider_index = spider_index;
	}
	
	
}
