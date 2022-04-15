package com.cg.placement.service;

import com.cg.placement.entities.User;
import com.cg.placement.entities.User;
import com.cg.placement.repository.IUserRepository;
import com.cg.placement.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService
{
	// Step 1: Establishing connection between Service and repo
	private IUserRepository dao;
	
	public UserServiceImpl() 
	{
		dao = new UserRepositoryImpl();
	}
	
	//Step 2: Service calls to perform CRUD Operations
	@Override
	public User addnewUser(User user)
	{
		dao.beginTransaction();
		dao.addnewUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User updateUser(User user) 
	{
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTrasaction();
		return user;
	}

	@Override
	public User login(User user) 
	{
		dao.beginTransaction();
		dao.login(user);
		dao.commitTrasaction();
		return user;
	
	}

	@Override
	public boolean logout()
	{
		dao.beginTransaction();
		dao.logout();
		dao.commitTrasaction();
		return true;
	}
	@Override
	public User searchUserById(int id)
	{
		User user = dao.searchUserById(id);
		return user;
	}
	@Override
	public User deleteUser(User user)
	{
		dao.beginTransaction();
		dao.deleteUser(user);
		dao.commitTrasaction();
		return user;
	}
}
