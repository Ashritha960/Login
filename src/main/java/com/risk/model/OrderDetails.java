package com.risk.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer orderId;
private Integer foodItemId;
private String foodItemName;
private Integer foodItemPrice;
private Integer quantity;
private Integer amount;
private String comment;
	


	@ManyToOne(optional = false, fetch=FetchType.LAZY)
	@JoinColumn(name = "customerId")
	private CustomerDetails customerDetails;



public Integer getOrderId() {
	return orderId;
}



public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}



public Integer getFoodItemId() {
	return foodItemId;
}



public void setFoodItemId(Integer foodItemId) {
	this.foodItemId = foodItemId;
}



public String getFoodItemName() {
	return foodItemName;
}



public void setFoodItemName(String foodItemName) {
	this.foodItemName = foodItemName;
}



public Integer getFoodItemPrice() {
	return foodItemPrice;
}



public void setFoodItemPrice(Integer foodItemPrice) {
	this.foodItemPrice = foodItemPrice;
}



public Integer getQuantity() {
	return quantity;
}



public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}



public Integer getAmount() {
	return amount;
}



public void setAmount(Integer amount) {
	this.amount = amount;
}



public String getComment() {
	return comment;
}



public void setComment(String comment) {
	this.comment = comment;
}



public CustomerDetails getCustomerDetails() {
	return customerDetails;
}



public void setCustomerDetails(CustomerDetails customerDetails) {
	this.customerDetails = customerDetails;
}



public OrderDetails(Integer orderId, Integer foodItemId, String foodItemName, Integer foodItemPrice, Integer quantity,
		Integer amount, String comment, CustomerDetails customerDetails) {
	super();
	this.orderId = orderId;
	this.foodItemId = foodItemId;
	this.foodItemName = foodItemName;
	this.foodItemPrice = foodItemPrice;
	this.quantity = quantity;
	this.amount = amount;
	this.comment = comment;
	this.customerDetails = customerDetails;
}



public OrderDetails() {
	super();
}
	


}

