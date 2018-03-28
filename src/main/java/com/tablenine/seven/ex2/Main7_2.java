package com.tablenine.seven.ex2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main7_2 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX2.xml");

		ctx.refresh();

		ctx.close();
	}
}
