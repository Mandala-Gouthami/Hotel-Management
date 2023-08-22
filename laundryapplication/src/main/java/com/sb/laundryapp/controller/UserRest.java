package com.sb.laundryapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.laundryapp.beans.CustomerItem;
import com.sb.laundryapp.beans.User;
import com.sb.laundryapp.exception.EntityCreationException;
import com.sb.laundryapp.exception.ForBiddenException;
import com.sb.laundryapp.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserRest {

	@Autowired
	private IUserService Service;

	@PostMapping("/login")
	public User loginUser(@RequestBody User user) throws Exception {
		String tempuid = user.getUserId();
		String trole=user.getRole();
		String temppwd = user.getPassword();
		User userobj = null;
		if (tempuid != null && temppwd != null) {
			userobj = Service.login(tempuid, temppwd,trole);
		}
		if (userobj == null) {
			throw new Exception("invalid crediantials");
		}
		return userobj;
	}

	@GetMapping("/all")
	public List<User> getAllCustomerItems() throws Exception {
		List<User> items = this.Service.getAllCustomerItem();
		return items;

	}
	@PostMapping("/admin")
	public User admin(@RequestBody User user) throws Exception {
		String tempuid = user.getUserId();
		String trole=user.getRole();
		String temppwd = user.getPassword();
		User userobj = null;
		if (tempuid != null && temppwd != null) {
			userobj = Service.login(tempuid, temppwd,trole);
		}
		if (userobj == null) {
			throw new Exception("invalid crediantials");
		}
		return userobj;
	}

	@PostMapping("/add")
	public User addUser(@RequestBody User user) throws Exception {
		// CustomerItem customerItem2 = this.iCustomerItemService.addItem(customerItem);
		User user1 = this.Service.adduser(user);
		return user1;

	}

}
