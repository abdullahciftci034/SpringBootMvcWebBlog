package com.abdullah.webapp.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GenericModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
