package com.json.parse.repositary;


import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.json.parse.model.Order;
import com.json.parse.model.OrderDetails;
import com.json.parse.service.OrderService;

@Service
public interface OrderRepositary extends Repository<Order, Long>{

	void save(Order order);

}
