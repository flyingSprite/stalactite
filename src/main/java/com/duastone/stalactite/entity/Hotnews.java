package com.duastone.stalactite.entity;
/** 
 * @author Quesle 
 * Github Quesle 
 * Date Jul 23, 2016 11:12:40 PM 
 */
public class Hotnews {
	
	private String _id;
	private long no;
	private String href;
	private String name;
	private String website;
	private String websiteUrl;
	private String type;
	private long startTimestamp;
	private long amendTimestamp;
	
	@Override
	public String toString() {
		return "Hotnews [_id=" + _id + ", no=" + no + ", href=" + href
				+ ", name=" + name + ", website=" + website + ", websiteUrl="
				+ websiteUrl + ", type=" + type + ", startTimestamp="
				+ startTimestamp + ", amendTimestamp=" + amendTimestamp + "]";
	}

	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getWebsiteUrl() {
		return websiteUrl;
	}
	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getStartTimestamp() {
		return startTimestamp;
	}
	public void setStartTimestamp(long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}
	public long getAmendTimestamp() {
		return amendTimestamp;
	}
	public void setAmendTimestamp(long amendTimestamp) {
		this.amendTimestamp = amendTimestamp;
	}
	
}
