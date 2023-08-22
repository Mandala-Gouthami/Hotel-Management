package com.sb.laundryapp.service;

import java.util.List;

import com.sb.laundryapp.beans.Customer;



public interface ICustomerService {

	Customer addCustomer(Customer customer);

	Customer removeCustomer(String custId);

	Customer updateCustomer(String custId, Customer customer);

	Customer getCustomer(String custId);

	List<Customer> getAllCustomers();
}