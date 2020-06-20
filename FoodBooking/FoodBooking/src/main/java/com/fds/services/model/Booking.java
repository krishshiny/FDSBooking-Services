package com.fds.services.model;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Booking")
public class Booking {

	@Id
    private ObjectId  _id;
	
	
	private ObjectId orderReferenceId;
	
	private String status;
	
	private String paymentType;
	
	private BigDecimal amount;
	
	private String paymentgateway;

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public ObjectId getOrderReferenceId() {
		return orderReferenceId;
	}

	public void setOrderReferenceId(ObjectId orderReferenceId) {
		this.orderReferenceId = orderReferenceId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPaymentgateway() {
		return paymentgateway;
	}

	public void setPaymentgateway(String paymentgateway) {
		this.paymentgateway = paymentgateway;
	}
	
	
	
}
