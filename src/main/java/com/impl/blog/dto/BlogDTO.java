package com.impl.blog.dto;

import javax.persistence.Column;

public class BlogDTO {

	private int id;
	private String question;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "BlogDTO [id=" + id + ", question=" + question + ", date=" + date + "]";
	}
	
}
