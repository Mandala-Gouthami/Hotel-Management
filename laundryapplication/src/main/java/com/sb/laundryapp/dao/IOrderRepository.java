package com.sb.laundryapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.laundryapp.beans.Order;


@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {

}
