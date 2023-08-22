package com.sb.laundryapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.laundryapp.beans.Customer;



@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {

}
