package com.ty.spring.core.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring.core.school.dao.UserDao;
import com.ty.spring.core.school.dto.User;
@Component
public class UserService {

	@Autowired
	UserDao userDao;
	public User saveUser(User user) {
		return userDao.saveUser(user);
	}
	public boolean deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}
	public User getUserById(int id) {
		return userDao.getUserById(id);	
	}
	public List<User> getAllStudent() {
		return userDao.getAllStudent();
	}
	public User updateUser(User user) {
		return userDao.updateUser(user);	
	}
	public User validateUser(int id,String name)
	{
		return userDao.validateUser(id, name);	
	}
}
