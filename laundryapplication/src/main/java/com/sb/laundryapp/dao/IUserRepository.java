package com.sb.laundryapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.laundryapp.beans.User;



@Repository
public interface IUserRepository extends JpaRepository<User, String> {
	
	public User findByUserIdAndPasswordAndRole(String userid, String password,String role);
}
