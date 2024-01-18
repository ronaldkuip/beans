package com.rkuip.services;

import java.util.List;

import com.rkuip.models.OrderModel;

public interface OrdersBusinessServiceInterface {
	public void test();
	
	public List<OrderModel> getOrders();
	
	public void init();
	
	public void destroy();
	
	
	// future methods
	
	// searchOrders(String searchTerm)
	
	// addOrder(OrderModel newO)
	
	// deleteOrder(Long id)
	
	// updateOrder(OrderModel updateMe)
	
	// getOneOrder(Long id)
	
	
}
