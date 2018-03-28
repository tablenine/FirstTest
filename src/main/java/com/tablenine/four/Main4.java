package com.tablenine.four;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main4 {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		pencil.use();
	}
}

