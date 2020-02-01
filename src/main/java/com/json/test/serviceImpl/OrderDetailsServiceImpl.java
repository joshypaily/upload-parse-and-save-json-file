package com.json.test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.json.test.model.Order;
import com.json.test.model.OrderDetails;
import com.json.test.repositary.OrderDetailsRepositary;
import com.json.test.service.OrderDetailsService;
import com.json.test.service.OrderService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{
	
	@Autowired
	private OrderDetailsRepositary orderDetailsRepositary;
	
	@Override
	public void save(OrderDetails orderDetails) {
		
		orderDetailsRepositary.save(orderDetails);
	}

}
