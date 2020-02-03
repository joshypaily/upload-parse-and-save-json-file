package com.json.parse.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.json.parse.model.Order;
import com.json.parse.model.OrderDetails;
import com.json.parse.repositary.OrderDetailsRepositary;
import com.json.parse.service.OrderDetailsService;
import com.json.parse.service.OrderService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{
	
	@Autowired
	private OrderDetailsRepositary orderDetailsRepositary;
	
	@Override
	public void save(OrderDetails orderDetails) {
		
		orderDetailsRepositary.save(orderDetails);
	}

}
