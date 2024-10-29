package com.example.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class TypeOfModel {
	@Min(value=1,message = "Minimal value is 1")
	private Integer id;
	
	@NotEmpty(message = "Category shouldn't be empty")
	private String category;
	
	
	public TypeOfModel() {}
	public TypeOfModel(Integer id, String category)
	{
		this.id=id;
		this.category=category;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
