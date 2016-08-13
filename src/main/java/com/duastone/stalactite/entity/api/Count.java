package com.duastone.stalactite.entity.api;
/** 
 * @author Quesle 
 * Github Quesle 
 * Date Mar 1, 2016 9:49:25 PM 
 */
public class Count {
	
	// Return the count of the blog
	private long blog;
	// Return the count of the ltaaa titles size;
	private long ltaaa;

    private long hotnews;
    private long cmsMonitor;
	
	
	public long getLtaaa() {
		return ltaaa;
	}
	public void setLtaaa(long ltaaa) {
		this.ltaaa = ltaaa;
	}
	public long getBlog() {
		return blog;
	}
	public void setBlog(long blog) {
		this.blog = blog;
	}
    public long getHotnews() {
        return hotnews;
    }
    public void setHotnews(long hotnews) {
        this.hotnews = hotnews;
    }

    public long getCmsMonitor() {
        return cmsMonitor;
    }

    public void setCmsMonitor(long cmsMonitor) {
        this.cmsMonitor = cmsMonitor;
    }
}
