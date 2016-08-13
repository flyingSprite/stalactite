package com.duastone.stalactite.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
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

    /**
     * Add blog entity
     * @param blog
     * @return
     * @throws Exception
     */
	@RequestMapping(
            value="/blog",
            method=RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public Blog post(@RequestBody Blog blog) throws Exception{
        // blogService provide saveBlog() service
    	blogService.saveBlog(blog);
		return blog;
	}

    /**
     * Modify blog entity
     * @param blog
     * @return
     * @throws Exception
     */
	@RequestMapping(
            value="/blog",
            method=RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
	public Blog put(@RequestBody Blog blog){
        // blogService provide saveBlog() service
        try {
            blogService.updateBlog(blog);
        } catch (Exception e) {
            return new Blog();
        }
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
