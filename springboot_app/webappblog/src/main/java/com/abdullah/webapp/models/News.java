package com.abdullah.webapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class News extends GenericModels{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String title;
	private String content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	public News(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
	public News() {
		super();
	}
	
	
}
