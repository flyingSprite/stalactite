package com.duastone.stalactite.entity;
/** 
 * @author Quesle 
 * Github Quesle 
 * Date Apr 23, 2016 4:57:23 PM 
 */
public class Pager {

	private long total;
	private int size = 20; // Size of one page
	private int page = 0;  // Start with 1

	@Override
	public String toString() {
		return "Pager [total=" + total + ", size=" + size + ", page=" + page + "]";
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
}
