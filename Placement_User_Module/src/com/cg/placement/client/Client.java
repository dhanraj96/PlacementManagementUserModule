package com.cg.placement.client;

import com.cg.placement.entities.User;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.UserServiceImpl;

public class Client 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method 
		User user = new User();
		
		IUserService service = new UserServiceImpl();
		
		// Create
		user.setId(85);
		user.setName("Shubham");
		user.setType("infosys");
		user.setPassword("Shubham@123");
		service.addnewUser(user);
		
	
		//System.out.println("ID is:"+user.getId());
		//System.out.println("Name is:"+user.getName());
		/*
		// Retrieve
		user = service.searchUserById(82);
		System.out.println("ID is:" +user.getId());
		System.out.println("Name is:" +user.getName());
		*/
		/*
		// Update
		user = service.searchUserById(81);
		user.setPassword("Shivraj@12");
		service.updateUser(user);
		System.out.println("Update is successful");
		*/
		/*
		// Delete
		user = service.searchUserById(83);
		service.deleteUser(user);
		System.out.println("Delete is successful");
		*/
	}

	}


