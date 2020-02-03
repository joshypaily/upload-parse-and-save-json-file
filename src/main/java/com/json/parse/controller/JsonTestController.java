package com.json.parse.controller;

import java.io.IOException;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.json.parse.model.Order;
import com.json.parse.model.OrderDetails;
import com.json.parse.service.OrderDetailsService;
import com.json.parse.service.OrderService;

@Controller
public class JsonTestController {
	
	@Autowired
	private OrderDetailsService orderDetailsService;
	
	@Autowired
	private OrderService orderService;

	@RequestMapping("/")
	public String getIndexPage() {
		
		return "home";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value="/upload")
	public ResponseEntity<String> upload(MultipartHttpServletRequest request, String modifiedBy) throws IOException {


		MultipartFile file = request.getFile("file");
	
		String orders= new String(file.getBytes());
		JSONParser jsonParser = new JSONParser();
	
		
        
	
        try {
        	//Read JSON file
            JSONObject jsonObjFromFile = (JSONObject) jsonParser.parse(orders);
            //get orders
            JSONArray orderList = (JSONArray) jsonObjFromFile.get("orders");
            
            orderList.forEach(orderJsonObj->{
            	JSONObject order=(JSONObject) orderJsonObj;
            	
            	String orderNo=(String) order.get("order_no");
            	Date  orderDate=new Date( order.get("order_date").toString());
            	//Calendar  orderDate=Calendar.getInstance();
            	
            	String customerName=(String) order.get("customer_name");
            	Order orderObj=new Order(orderNo,orderDate,customerName);
            	
            	orderService.save(orderObj);
            	
            	//get order details
            	JSONArray orderDetailsList = (JSONArray) order.get("order_details");
            	orderDetailsList.forEach(orderDetailsJsonObj->{
            		
	        		JSONObject orderDetails=(JSONObject) orderDetailsJsonObj;
	        		
	        		String orderDetailsOrderNo=(String) orderDetails.get("order_no");
	        		String itemCode=(String) orderDetails.get("item_code");
	        		String itemName=(String) orderDetails.get("item_name");
	        		int qty=Integer.parseInt(orderDetails.get("qty").toString());
	        		float unitPrice=Float.parseFloat(orderDetails.get("unit_price").toString());
	        		
	        		OrderDetails orderDetailsObj=new OrderDetails(orderDetailsOrderNo,itemCode,itemName,qty,unitPrice);
	        		orderDetailsService.save(orderDetailsObj);
	        		
            	});
            	
            }); 
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return new ResponseEntity("Successfully uploaded and saved data to database", HttpStatus.OK);
	}
	
}