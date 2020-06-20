package com.fds.services.model;

import org.bson.types.ObjectId;

public class UserVM {

	
	private ObjectId referenceId;
	
	private String userName;
	
	private String phoneNumber;



	public ObjectId getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(ObjectId referenceId) {
		this.referenceId = referenceId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}
