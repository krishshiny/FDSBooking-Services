package com.fds.services.model;

import org.bson.types.ObjectId;

public class RestarantsVM {

	private ObjectId referenceId;
	
	private String name;
	
	private String rating;

	public ObjectId getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(ObjectId referenceId) {
		this.referenceId = referenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
