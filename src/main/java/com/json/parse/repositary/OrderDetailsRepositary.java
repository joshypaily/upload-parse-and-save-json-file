package com.json.parse.repositary;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.json.parse.model.OrderDetails;

@Service
public interface OrderDetailsRepositary extends Repository<OrderDetails, Long>{

	void save(OrderDetails orderDetails);

}

