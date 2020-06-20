package com.fds.services.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Restarants")
public class Restarants {

	@Id
    private ObjectId  _id;
	
	private String name;
	
	private String address;
	
	private String pincode;
	
	private String rating;
	
	private boolean active;
	
	private List<Food> foodItems;


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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Food> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<Food> foodItems) {
		this.foodItems = foodItems;
	}
	
	
}
