package com.pack.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.bean.Demo;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/pack/config/Spring.xml");
		Demo dm =ctx.getBean("demo",Demo.class);
		dm.show1();
		System.out.println(".......");
		dm.show2();
		System.out.println(".......");
		dm.show3();
		System.out.println(".......");
		dm.show4();
		System.out.println(".......");

	}

}
