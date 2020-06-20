package com.fds.services.model;

import java.sql.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Order")
public class Order {

	@Id
    private ObjectId  _id;
	
	private Date orderDateTime;
	
	private Date deliveryDateTime;
	
	private String deliveryPerson;
	
	private List<Food> orderedItems;
	
	private UserVM userInfo;
	
	private RestarantsVM restarantsInfo;
	
	private String rating;
	
	private String status;


	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Date getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public Date getDeliveryDateTime() {
		return deliveryDateTime;
	}

	public void setDeliveryDateTime(Date deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
	}

	public String getDeliveryPerson() {
		return deliveryPerson;
	}

	public void setDeliveryPerson(String deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}

	public List<Food> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(List<Food> orderedItems) {
		this.orderedItems = orderedItems;
	}

	public UserVM getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserVM userInfo) {
		this.userInfo = userInfo;
	}

	public RestarantsVM getRestarantsInfo() {
		return restarantsInfo;
	}

	public void setRestarantsInfo(RestarantsVM restarantsInfo) {
		this.restarantsInfo = restarantsInfo;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
