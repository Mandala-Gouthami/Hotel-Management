package com.sb.laundryapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.sb.laundryapp.beans.CustomerItem;
import com.sb.laundryapp.beans.User;
import com.sb.laundryapp.dao.IUserRepository;
import com.sb.laundryapp.dao.QueryClassPersisitContext;
import com.sb.laundryapp.exception.EntityCreationException;
import com.sb.laundryapp.exception.EntityDeletionException;
import com.sb.laundryapp.exception.EntityNotFoundException;
import com.sb.laundryapp.validators.InputValidator;


@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository repo;

	@Override
	public User login(String Userid, String Password, String role) {
		// TODO Auto-generated method stub
		return repo.findByUserIdAndPasswordAndRole(Userid, Password,role);
		
		
		//return null;
	}
	
	public List<User> getAllCustomerItem() throws Exception {
        List<User> allItems=new ArrayList<User>();
        allItems=repo.findAll();
        if(!allItems.isEmpty()) {
            return allItems;
        }else {
            throw new Exception("no data available");
        }
 
    }

	@Override
	public User adduser(User user) throws Exception {
		
		Optional<User> user2=repo.findById(user.getUserId());
		if(user2.isPresent())
		{
			throw new Exception("username already used");
		}
		else {
		 User user1=repo.save(user);
		 return user1;
		}
	}

	public User Admin(String Userid, String Password, String role) throws Exception {
		// TODO Auto-generated method stub
		return repo.findByUserIdAndPasswordAndRole(Userid, Password,role);
	}
	
/*
 * */
	

}
