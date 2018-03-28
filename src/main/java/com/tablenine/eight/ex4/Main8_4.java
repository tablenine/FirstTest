package com.tablenine.eight.ex4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class Main8_4 {
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

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_run.xml", "applicationCTX_dev.xml");
		ctx.refresh();

		ServerInfo serverInfo = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println(serverInfo.getIp());
		System.out.println(serverInfo.getPort());
	}
}
