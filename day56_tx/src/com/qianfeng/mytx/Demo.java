package com.qianfeng.mytx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/qianfeng/mytx/bean.xml");
		UserService us = (UserService)ac.getBean("userService");
//		us.addInfo(null);
		us.addInfo();
	}

}
