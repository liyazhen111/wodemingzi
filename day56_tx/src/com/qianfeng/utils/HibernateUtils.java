package com.qianfeng.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory = null;
	
	static{
		// 创建Configuration对象
		Configuration cfg = new Configuration();
		// 自动加载src下的hibernate.cfg.xml 配置文件
		cfg.configure();
		
		// 创建SessionFactoy对象
		factory = cfg.buildSessionFactory();
	}
	
	// 获取session对象
	public static Session getSession(){
		// 每次调用，都会创建一个新的session对象
		// 如果不使用了，需要手动关闭
		// 查询时，不需要使用事务
//		return factory.openSession();
		
		// 获取当前线程绑定的session对象 （原理：通过ThreadLocal实现）
		// 只要在同一个线程里，不管在哪调用，都会得到同一个session对象
		// 提交或者回滚的时候，会自动关闭session对象
		// 使用getCurrentSession后，进行数据库操作时，必须使用事务，哪怕是进行查询操作
		return factory.getCurrentSession();
	}
}
