package com.sb.laundryapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.laundryapp.beans.User;



@Repository
public interface IAdminRepository extends JpaRepository<User, Integer> {

}
