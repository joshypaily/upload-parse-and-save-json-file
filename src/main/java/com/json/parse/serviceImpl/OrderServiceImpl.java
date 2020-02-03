package com.json.parse.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.stereotype.Service;

import com.json.parse.model.Order;
import com.json.parse.repositary.OrderRepositary;
import com.json.parse.service.OrderService;

@Service
public class OrderServiceImpl  implements OrderService{

	@Autowired
	private OrderRepositary orderRepositary;
	
	
	@Override
	public void save(Order order) {
		orderRepositary.save(order);
		
	}

}
