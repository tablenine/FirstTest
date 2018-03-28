package com.tablenine.eight.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main8_3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection adminConnection = ctx.getBean("adminConnection3", AdminConnection.class);

		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPswd());
		System.out.println(adminConnection.getSub_adminId());
		System.out.println(adminConnection.getSub_adminPswd());

		ctx.close();
	}
}
