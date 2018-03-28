package com.tablenine.eight.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main8_2 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX8.xml");
		AdminConnection adminConnection = ctx.getBean("adminConnection2", AdminConnection.class);

		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPswd());
		System.out.println(adminConnection.getSub_adminId());
		System.out.println(adminConnection.getSub_adminPswd());
	}
}
