package com.sb.laundryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.laundryapp.beans.Order;
import com.sb.laundryapp.dao.IOrderRepository;
import com.sb.laundryapp.exception.EmptyEntityListException;
import com.sb.laundryapp.exception.EntityCreationException;
import com.sb.laundryapp.exception.EntityDeletionException;
import com.sb.laundryapp.exception.EntityUpdationException;


@Service
@Transactional
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private IOrderRepository orderRepository;

	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		try {
			Order order1 = orderRepository.save(order);
			return order1;

		} catch (Exception e) {
			throw new EntityCreationException("Failed to Create Order.");
		}

	}

	@Override
	public Order removeOrder(long id) {

		Optional<Order> optionalOrder = orderRepository.findById(id);
		Order order = null;
		if (optionalOrder.isPresent()) {
			order = optionalOrder.get();
			orderRepository.deleteById(id);
			return order;
		} else {
			throw new EntityDeletionException("Order With Id " + id + " does not Exist.");
		}

	}

	@Override
	public Order updateOrder(long id, Order order) {
		Optional<Order> optionalOrder = null;
		Order order2 = null;

		optionalOrder = orderRepository.findById(id);
		if (optionalOrder.isPresent()) {
			order2 = orderRepository.save(order);
			return order2;
		} else {
			throw new EntityUpdationException("order With Id " + id + " does Not Exist.");
		}
	}

	@Override
	public Order getOrderDetails(long id) {
		Optional<Order> optionalorder = null;
		Order order = null;

		optionalorder = orderRepository.findById(id);
		if (optionalorder.isPresent()) {
			order = optionalorder.get();
			return order;
		} else {
			throw new EntityUpdationException("Order With Id " + id + " does Not Exist.");
		}
	}

	@Override
	public List<Order> getAllOrders() {
		List<Order> allOrderers = new ArrayList<Order>();

		allOrderers = orderRepository.findAll();
		if (!allOrderers.isEmpty()) {
			return allOrderers;
		} else {
			throw new EmptyEntityListException("No Orders Found.");
		}
	}

	

}
