package com.tablenine.eight.ex1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;

public class Main8_1 {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();

		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pswd"));
		} catch (IOException e) {
		}
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("classpath:applicationCTX8.xml");
		gCtx.refresh();

		AdminConnection adminConnection = gCtx.getBean("adminConnection", AdminConnection.class);
		System.out.println(adminConnection.getAdminId());
		System.out.println(adminConnection.getAdminPswd());

		gCtx.close();
		ctx.close();
	}
}
