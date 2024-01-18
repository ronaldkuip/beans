package com.rkuip.services;

import java.util.ArrayList;
import java.util.List;

import com.rkuip.models.OrderModel;

public class OrdersBusinessService2 implements OrdersBusinessServiceInterface{

	
	List<OrderModel> orders;
	
	
	@Override
	public void test() {
		System.out.println("OrderBusinessSerive is working");
		
	}

	@Override
	public List<OrderModel> getOrders() {
		
		
		orders.add(new OrderModel(0L, "AAA", "Big Mac", 3.0f, 1));
		orders.add(new OrderModel(1L, "AAB", "Large Fries", 2.50f, 5));
		orders.add(new OrderModel(2L, "AAC", "Chicken Nuggets", 1.75f, 2));
		orders.add(new OrderModel(3L, "AAD", "Coke", 0.99f, 1));
		orders.add(new OrderModel(4L, "AAE", "Apple Pie", 0.40f, 1)); 
		
		return orders;
	}
	

	@Override
	public void init() {
		System.out.println("Init method of the Orders Business Service 2");
		orders = new ArrayList<OrderModel>();
	}

	@Override
	public void destroy() {
		System.out.println("Destroy method of the Orders Business Service 2");
		
	}

}
