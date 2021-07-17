package com.impl.blog.dto;

import javax.persistence.Column;

public class UserDTO {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + "]";
	}
	
}
