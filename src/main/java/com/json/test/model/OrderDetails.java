package com.json.test.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
//@SequenceGenerator(name="order_details", initialValue=1, allocationSize=100)
@Table(name="order_details")
public class OrderDetails {

	
	/*
	 * @Id
	 * 
	 * @GeneratedValue private Long id;
	 */
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="order_no")
	String  orderNo;

	@Column(name="item_code")
	String  itemCode;
	
	@Column(name="item_name")
	String  itemName;
	
	@Column(name="qty")
	int  qty;
	
	@Column(name="unit_price")
	Float  unitPrice;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public OrderDetails( String orderNo,String itemCode, String itemName, int qty, Float unitPrice) {
		super();
		//this.id=id;
		this.orderNo = orderNo;
		this.itemCode=itemCode;
		this.itemName = itemName;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public OrderDetails() {
		super();
		
	}

}
