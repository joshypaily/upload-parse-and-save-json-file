package com.json.parse.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="orders")
public class Order {

	@Id
	@Column(name="order_no")
	String  orderNo;
	
	@Column(name="order_date")
	Date  orderDate;
	
	@Column(name="customer_name")
	String  customerName;

	public Order(String orderNo, Date orderDate, String customerName) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.customerName = customerName;
	}

	public Order() {
		super();
	}
	
}
