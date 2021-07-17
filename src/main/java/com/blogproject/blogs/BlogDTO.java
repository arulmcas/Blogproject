package com.blogproject.blogs;

import javax.persistence.Column;

public class BlogDTO {

	private int id;
	private String blogname;
	private String question;
	private String date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBlogname() {
		return blogname;
	}
	public void setBlogname(String blogname) {
		this.blogname = blogname;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BlogDTO [id=" + id + ", blogname=" + blogname + ", question=" + question + ", date=" + date + "]";
	}
	
	
}
