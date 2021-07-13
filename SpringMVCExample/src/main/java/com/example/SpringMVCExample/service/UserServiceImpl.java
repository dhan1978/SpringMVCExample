package com.example.SpringMVCExample.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.SpringMVCExample.dao.UserDAO;
import com.example.SpringMVCExample.model.Users;
@Service
public class UserServiceImpl implements UserService {
	private UserDAO userDAO;

	

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Transactional
	public void addUser(Users p) {
		// TODO Auto-generated method stub
		userDAO.addUser(p);
	}
	@Transactional
	public void updateUser(Users p) {
		// TODO Auto-generated method stub
		userDAO.updateUser(p);
	}
	@Transactional
	public List<Users> listUsers() {
		// TODO Auto-generated method stub
		return userDAO.listUser();
	}
	@Transactional
	public Users getUserById(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(id);
	}
	@Transactional
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		userDAO.removeUser(id);
	}
	

	
}
