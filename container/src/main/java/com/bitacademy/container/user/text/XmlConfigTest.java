package com.bitacademy.container.user.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import containercom.bitacademy.container.user.User01;

public class XmlConfigTest {

	public static void main(String[] args) {
		// XML Auto. Configuration(
		testApplocationcontest01();

		// XML Bean Configuration (Explicit Config)
		testApplocationcontest02();
		
	}
	


	private static void testApplocationcontest01() {
		ApplicationContext ac =new ClassPathXmlApplicationContext("com/bitacademy/container/config/user/applicationContext01.xml");
		
		User01 user01 = ac.getBean(User01.class);
		System.out.println(user01.getName());
		
		//Beand의 id가 자동으로 설정된다.
		user01 = (User01)ac.getBean("user01");
		System.out.println(user01.getName());
		
	
	
	}	
	
	private static void testApplocationcontest02() {
ApplicationContext ac =new ClassPathXmlApplicationContext("com/bitacademy/container/config/user/applicationContext02.xml");
		
		User01 user01 = ac.getBean(User01.class);
		System.out.println(user01.getName());
		
		//Beand의 id가 자동으로 설정된다.
		user01 = (User01)ac.getBean("user01");
		System.out.println(user01.getName());		
	}

}
