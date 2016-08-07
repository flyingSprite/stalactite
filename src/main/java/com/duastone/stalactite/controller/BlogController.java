package com.duastone.stalactite.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.duastone.stalactite.entity.Blog;
import com.duastone.stalactite.service.BlogService;

/** 
 * @author Quesle 
 * Github Quesle
 * Date Feb 8, 2016 10:02:17 PM
 */

@RestController
public class BlogController {
	
	@Resource
	private BlogService blogService;

	// Post a blog to server.
	@RequestMapping(value="/blog", method=RequestMethod.POST)
	public Blog post(Blog blog, boolean isUpdate) throws Exception{
		System.out.println(isUpdate);
		if (isUpdate) {
			this.put(blog);
		} else {
			blogService.saveBlog(blog);
		}
		return blog;
	}
	
	@RequestMapping(value="/blog", method=RequestMethod.PUT)
	public Blog put(Blog blog) throws Exception{
		blogService.updateBlog(blog);
		return blog;
	}
	
	@RequestMapping(value="/blog/info", method=RequestMethod.GET)
	public Blog get(String id) throws Exception{
		System.out.println(id);
		return blogService.getBlog(id);
	}
	
	@RequestMapping(value="/blog", method=RequestMethod.GET)
	public List<Blog> gets(){
		List<Blog> blogs = new ArrayList<Blog>();
		
		try {
			blogs = blogService.getBlogs();
			// System.out.println(blogs);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return blogs;
	}
}
