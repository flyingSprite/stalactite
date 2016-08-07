package com.duastone.stalactite.service;

import java.util.List;

import com.duastone.stalactite.entity.Blog;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Feb 14, 2016 9:57:18 PM 
 */
public interface BlogService {
	
	public void saveBlog(Blog blog) throws Exception;
	
	public List<Blog> getBlogs() throws Exception;
	
	public Blog getBlog(String id) throws Exception;
	
	public void updateBlog(Blog blog) throws Exception;
}
