package com.duastone.stalactite.action;

import java.util.List;

import com.duastone.stalactite.entity.Blog;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Feb 21, 2016 7:48:09 PM 
 */
public interface BlogAction extends BaseAction<Blog>{
	
	public List<Blog> findTitleList();
	
	public void updateContent(Blog blog);
	
	public long totalCount();
}
