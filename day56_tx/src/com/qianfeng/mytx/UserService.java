package com.qianfeng.mytx;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianfeng.utils.HibernateUtils;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
//	public void addInfo(Session ){
//		
//			userDao.add(session);
//			
//			userDao.delete(session);
//		
//	}
	
	public void addInfo( ){
		
		userDao.add();
		
		userDao.delete();
	
	}
	
//	public void deleteInfo(Session session){
//		
//			userDao.delete(session);
//			
//			userDao.delete(session);
//			userDao.add(session);
//	}
			
}
