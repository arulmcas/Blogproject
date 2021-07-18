package com.blogproject.comments;

import java.util.function.Function;

import com.blogproject.blogs.Blog;
import com.blogproject.blogs.BlogService;

public class CommentService {

	CommentRepository commentRepository = new CommentRepository();
	BlogService blogService = new BlogService();
	
	public String createComment(CommentDTO commentDTO, int blogid) {
		Blog blog = blogService.getBlog(blogid);
		commentDTO.setBlog(blog);
		String id = commentRepository.createComment(commentDataMapping.apply(commentDTO));
		return id;
	}
	

	Function<CommentDTO, Comment> commentDataMapping = (commentDTO) -> {
		Comment comment = new Comment();
		comment.setData(commentDTO.getData());
		comment.setDate(commentDTO.getDate());
		comment.setParentcomment(commentDTO.getParentcomment());
		comment.setBlog(commentDTO.getBlog());
		return comment;
	};
}
