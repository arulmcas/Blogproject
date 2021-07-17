package com.blogproject.comments;

public class CommentsDTO {

	private int id;
	private String comment;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "CommentsDTO [id=" + id + ", comment=" + comment + ", date=" + date + "]";
	}
	
}
