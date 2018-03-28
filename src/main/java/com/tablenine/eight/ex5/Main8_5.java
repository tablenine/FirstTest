package com.tablenine.eight.ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main8_5 {
	public static void main(String[] args) {
		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		if ("dev".equals(str)) {
			config = "dev";
		} else if ("run".equals(str)) {
			config = "run";
		}
		scanner.close();

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.register(ApplicationConfigDev.class, ApplicationConfigRun.class);
		ctx.refresh();
		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println(serverInfo.getIp());
		System.out.println(serverInfo.getPort());
	}
}
