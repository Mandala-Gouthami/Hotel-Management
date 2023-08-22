package com.sb.laundryapp.service;



import java.util.List;

import com.sb.laundryapp.beans.Order;

public interface IOrderService {

	Order addOrder(Order order);

	Order removeOrder(long id);

	Order updateOrder(long id, Order order);

	Order getOrderDetails(long id);

	List<Order> getAllOrders();
}
