package com.qianfeng.xmltx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(){
		
		userDao.add();
		
		int a = 10 / 0;
		
	}
	
	public void findAllUser(){
		
	}
	
	public void deleteUserById(){
		
	}
}
