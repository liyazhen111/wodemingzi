package com.qianfeng.xmltx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/qianfeng/xmltx/bean.xml");
		UserService us = (UserService)ac.getBean("userService");
		us.addUser();
	}

}
