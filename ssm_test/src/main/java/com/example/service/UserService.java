package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.UserDao;
import com.example.pojo.User;

public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public List<User> selectUserByUsername(String username) {
		return userDao.selectUserByUsername(username);
	}
	

}
