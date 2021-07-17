package com.impl.blog;

import java.util.Date;

import com.impl.blog.dto.BlogDTO;

public class BlogController {

	BlogService blogService = new BlogService();
	public static BlogDTO blogDTO = new BlogDTO();
	
	public static void main(String args[]) {
		BlogController blogController = new BlogController();
		blogDTO.setQuestion("What is the latest version of hibernate?");
		blogDTO.setDate(new Date()+"");
		blogController.createBlog();
	}
	
	public void createBlog() {
		String id = blogService.createBlog(blogDTO);
	}
}
