package com.json.test.repositary;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.json.test.model.OrderDetails;

@Service
public interface OrderDetailsRepositary extends Repository<OrderDetails, Long>{

	void save(OrderDetails orderDetails);

}

