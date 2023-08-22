package com.sb.laundryapp.service;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.sb.laundryapp.beans.User;
import com.sb.laundryapp.exception.EntityCreationException;
import com.sb.laundryapp.exception.EntityDeletionException;



public interface IUserService {
/*
	HttpStatus validateUser(String username, String password) throws Exception;

	public User addUser(User user) throws EntityCreationException;

	public User removeUser(User user) throws EntityDeletionException; */
	public User login(String Userid, String Password,String role);
	public User adduser(User user) throws Exception;
	public List<User> getAllCustomerItem() throws Exception;
	public User Admin(String Userid, String Password, String role) throws Exception;

}
