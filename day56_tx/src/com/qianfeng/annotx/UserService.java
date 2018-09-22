package com.qianfeng.annotx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Transactional 也可以在类上使用，所有的方法采用相同的事务处理策略
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserService userService;
	
	// 配置事务
	// REQUIRED 两个方法中的事务，进行事务合并（两个事务合并成一个事务）
	// REQUIRES_NEW 两个方法中的事务相互独立，原方法中事务会挂起，调用的方法执行完后，原方法继续执行
//	@Transactional(readOnly=false, // 是否只读
//			propagation=Propagation.REQUIRED, // 事务的传播特性
//			isolation=Isolation.DEFAULT, // 事务的隔离级别，使用数据库默认的隔离级别
//			timeout=3, // 事务的超时时间
//			noRollbackFor=java.lang.ArithmeticException.class // 指定不用回滚的异常
//			)
	@Transactional(readOnly=false, // 是否只读
			propagation=Propagation.REQUIRED // 事务的传播特性
			)
	public void addUser(){
		userDao.add();
		
//		int a = 10 / 0;
		
		//this.updateUser();
//		userService.updateUser();
		
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;// 会进行回滚操作
		}
		

		
	}
	@Transactional(readOnly=false, propagation=Propagation.REQUIRED)
	public void updateUser(){
		userDao.update();
//		int a = 10 / 0;
	}
	
	@Transactional(readOnly=true,
			propagation=Propagation.NOT_SUPPORTED
			)
	public void findAllUser(){
		
	}
	
	public void deleteUserById(){
		
	}
}
