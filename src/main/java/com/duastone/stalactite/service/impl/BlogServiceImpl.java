package com.duastone.stalactite.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.duastone.stalactite.action.BlogAction;
import com.duastone.stalactite.entity.Blog;
import com.duastone.stalactite.service.BlogService;

/** 
 * @author Quesle 
 * Github Quesle 
 * Date Feb 14, 2016 9:57:28 PM 
 */
@Service("blogServiceImpl")
public class BlogServiceImpl implements BlogService{
	
	@Resource
	private BlogAction blogAction;

	@Override
	public void saveBlog(Blog blog) throws Exception {
		if(blog == null){
			throw new Exception("Blog is null.");
		}
		
		if(StringUtils.isBlank(blog.getTitle())){
			throw new Exception("Blog title is null.");
		}
		
		if(StringUtils.isBlank(blog.getContent())){
			throw new Exception("Blog content is null.");
		}
		
		if(StringUtils.isBlank(blog.getAuthor())){
			blog.setAuthor("Quesle");
		}
		
		blog.setCurrentDate(new Date());
		blogAction.save(blog);
	}

	@Override
	public List<Blog> getBlogs() throws Exception {
		return blogAction.findTitleList();
	}
	
	@Override
	public Blog getBlog(String id) throws Exception{
		return (Blog) blogAction.find(Blog.class, id);
	}
	
	@Override
	public void updateBlog(Blog blog) throws Exception{
		if(blog == null){
			throw new Exception("Blog is null.");
		}
		
		if(StringUtils.isBlank(blog.getId())){
			throw new Exception("Blog id is null.");
		}
		
		if(StringUtils.isBlank(blog.getTitle())){
			throw new Exception("Blog title is null.");
		}
		
		if(StringUtils.isBlank(blog.getContent())){
			throw new Exception("Blog content is null.");
		}
		blog.setLastUpdateDate(new Date());
		blogAction.updateContent(blog);
		
	}
	

}
