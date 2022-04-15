package com.cg.placement.service;


import com.cg.placement.entities.User;

public interface IUserService
{
public User addnewUser(User user); // C
public User updateUser(User user); //U
public User searchUserById(int id); //R
public User deleteUser(User user);//D
public User login(User user);

public boolean logout();
}
