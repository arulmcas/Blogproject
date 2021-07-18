package com.blogproject.comments;

import java.util.Date;

public class CommentController {

	CommentService commentService = new CommentService();
	
	public static void main(String args[]) {
		CommentController commentController = new CommentController();
		commentController.createComment();
	}
	
	public CommentDTO createComment() {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setData("2 types of exception");
		commentDTO.setDate(new Date()+"");
		commentDTO.setParentcomment("exception");
		String id = commentService.createComment(commentDTO,2);
		commentDTO.setId(Integer.parseInt(id));
		return commentDTO;
	}
	
	
}
