package com.tablenine.seven.ex1;

import com.tablenine.three.Student;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main7_1 {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:applicationCTX2.xml");
		ctx.refresh();

		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println(student1.getName());

		ctx.close();
	}
}
