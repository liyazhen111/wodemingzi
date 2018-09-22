package com.qianfeng.annotx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/qianfeng/annotx/bean.xml");
		UserService us = (UserService)ac.getBean("userService");
		us.addUser();
	}

}
