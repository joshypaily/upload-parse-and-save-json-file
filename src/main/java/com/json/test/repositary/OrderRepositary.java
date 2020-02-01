package com.json.test.repositary;


import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.json.test.model.Order;
import com.json.test.model.OrderDetails;
import com.json.test.service.OrderService;

@Service
public interface OrderRepositary extends Repository<Order, Long>{

	void save(Order order);

}
