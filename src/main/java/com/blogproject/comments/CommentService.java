package com.blogproject.comments;

import java.util.function.Function;

public class CommentService {

	CommentRepository commentRepository = new CommentRepository();
	
	public String createComment(CommentDTO commentDTO) {
		String id = commentRepository.createComment(commentDataMapping.apply(commentDTO));
		return id;
	}
	
	Function<CommentDTO, Comment> commentDataMapping = (commentDTO) -> {
		Comment comment = new Comment();
		comment.setData(commentDTO.getData());
		comment.setDate(commentDTO.getDate());
		comment.setParentcomment(commentDTO.getParentcomment());
		return comment;
	};
}
