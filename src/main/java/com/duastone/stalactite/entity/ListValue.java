package com.duastone.stalactite.entity;
/** 
 * @author Quesle 
 * Github Quesle 
 * Date Apr 23, 2016 11:41:46 PM 
 */
public class ListValue {
	
	private Pager pager;
	private Object data;
	
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
