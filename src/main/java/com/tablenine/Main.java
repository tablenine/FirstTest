package com.tablenine;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCalculator = ctx.getBean("myCal", MyCalculator.class);

		myCalculator.add();
		myCalculator.sub();
		myCalculator.div();
		myCalculator.mul();
	}
}

