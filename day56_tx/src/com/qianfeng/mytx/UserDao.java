package com.qianfeng.mytx;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.qianfeng.utils.HibernateUtils;

@Repository
public class UserDao {
	
//	public void add(Session session){
//		
//		User u = new User();
//		u.setName("wangwu");
//		session.save(u);
//	}
	
	public void add(){
		Session session = HibernateUtils.getSession();
		User u = new User();
		u.setName("wangwu");
		session.save(u);
	}
	
//	public void delete(Session session){
//		
//		User u = new User();
//		u.setId(2);
//		session.delete(u);
//		
//	}
	
	public void delete(){
		Session session = HibernateUtils.getSession();
		User u = new User();
		u.setId(3);
		session.delete(u);
		
	}
}
