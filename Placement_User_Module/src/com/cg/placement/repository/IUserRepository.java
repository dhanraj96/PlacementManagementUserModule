package com.cg.placement.repository;

import com.cg.placement.entities.User;
public interface IUserRepository

{
	public User addnewUser(User user) ; //C
	public User updateUser(User user); //U
	void deleteUser(int id); //D
	public User deleteUser(User user); //D
	public User searchUserById(int id); //R
	public abstract void beginTransaction();
	public abstract void commitTrasaction();
	public void login(User user);
	public void logout();
}
