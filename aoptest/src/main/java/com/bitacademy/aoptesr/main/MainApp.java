package com.bitacademy.aoptesr.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bitacademy.aoptesr.service.ProductService;
import com.bitacademy.aoptesr.vo.ProductVo;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/appocatipnContext.xml"); 

		ProductService ps = ac.getBean(ProductService.class);
		ProductVo vo = ps.find("TV");
		System.out.println(vo);
	}

}
