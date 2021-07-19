package com.blogproject.blogs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.blogproject.comments.Comment;


public class BlogController {

	BlogService blogService = new BlogService();
	public static BlogDTO blogDTO = new BlogDTO();
	
	public static void main(String args[]) {
		BlogController blogController = new BlogController();
//		blogController.createBlog();
		blogController.getBlog();
	}
	
	public void createBlog() {
		blogDTO.setBlogname("exception");
		blogDTO.setQuestion("types of exception");
		blogDTO.setDate(new Date()+"");
		String id = blogService.createBlog(blogDTO);
	}
	
	public void getBlog() {
		Blog blog= blogService.getBlog(1);
		System.out.println(blog);
	}
}
