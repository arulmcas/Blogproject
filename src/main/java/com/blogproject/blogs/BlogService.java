package com.blogproject.blogs;

import java.util.function.Function;
import org.hibernate.loader.custom.Return;

public class BlogService {

	BlogRepository blogRepository = new BlogRepository();
	public String createBlog(BlogDTO blogDTO) {
		String id = blogRepository.createBlog(blogDataMaping.apply(blogDTO));
		return id;
	}
	
	Function<BlogDTO, Blog> blogDataMaping = (blogDTO) -> {
		Blog blog = new Blog();
		blog.setBlogname(blogDTO.getBlogname());
		blog.setQuestion(blogDTO.getQuestion());
		blog.setDate(blogDTO.getDate());
		return blog;
	};
}
