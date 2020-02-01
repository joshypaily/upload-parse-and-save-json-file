package com.json.test.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.stereotype.Service;

import com.json.test.model.Order;
import com.json.test.repositary.OrderRepositary;
import com.json.test.service.OrderService;

@Service
public class OrderServiceImpl  implements OrderService{

	@Autowired
	private OrderRepositary orderRepositary;
	
	
	@Override
	public void save(Order order) {
		orderRepositary.save(order);
		
	}

}
