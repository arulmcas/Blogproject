package com.impl.blog;

import java.util.function.Function;

import org.hibernate.loader.custom.Return;

import com.impl.blog.dto.BlogDTO;
import com.impl.blog.entity.Blog;

public class BlogService {

	BlogRepository blogRepository = new BlogRepository();
	public String createBlog(BlogDTO blogDTO) {
		String id = blogRepository.createBlog(blogDataMaping.apply(blogDTO));
		return id;
	}
	
	Function<BlogDTO, Blog> blogDataMaping = (blogDTO) -> {
		Blog blog = new Blog();
		blog.setQuestion(blogDTO.getQuestion());
		blog.setDate(blogDTO.getDate());
		return blog;
	};
}
