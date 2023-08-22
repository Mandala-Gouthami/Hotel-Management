package com.sb.laundryapp.service;

import java.util.List;

import com.sb.laundryapp.beans.Payment;



public interface IPaymentService {

	Payment addPayment(Payment payment);

	Payment removePayment(long id);

	Payment updatePayment(long id, Payment payment);

	Payment getPaymentDetails(long id);

	List<Payment> getAllPaymentDetails();

}
