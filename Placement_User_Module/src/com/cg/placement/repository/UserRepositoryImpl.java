package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.User;
import com.cg.placement.entities.User;
import com.cg.placement.entities.User;

public class UserRepositoryImpl implements IUserRepository
{
	// Start JPA Life Cycle
	private EntityManager entityManager;
	
	public UserRepositoryImpl() 
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	// Create operation Repo/Dao
	@Override
	public User addnewUser(User user) 
	{
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) 
	{
		entityManager.merge(user);
		return user;
	}


	@Override
	public void beginTransaction()
	{
	
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTrasaction()
	{
	
		entityManager.getTransaction().commit();
	}
	@Override
	public void login(User user)
	{
		entityManager.getTransaction().begin();
	}
	@Override
	public void logout() 
	{
		entityManager.getTransaction().commit();
	}
	@Override
	public void deleteUser(int id)
	{

		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
		
	}
	@Override
	public User searchUserById(int id)
	{

		User user = entityManager.find(User.class, id);
		return user;
	}
	@Override
	public User deleteUser(User user)
	{

		entityManager.remove(user);
		return user;
	}
}
