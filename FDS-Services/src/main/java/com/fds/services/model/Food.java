package com.fds.services.model;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FoodItems")
public class Food {

	@Id
    private ObjectId  _id;
	
	private String name;
	
	private BigDecimal  price;
	
	private String foodType;



	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal  getPrice() {
		return price;
	}

	public void setPrice(BigDecimal  price) {
		this.price = price;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	
	
}
