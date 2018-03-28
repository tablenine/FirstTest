package com.tablenine.seven.ex3;

import com.tablenine.three.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main7_3 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX2.xml");

		Student student1 = ctx.getBean("student7", Student.class);
		Student student2 = ctx.getBean("student7", Student.class);
		System.out.println(student1.getName());

		student2.setName("홍홍홍");
		System.out.println(student1.getName());

		System.out.println(student1.equals(student2));
		ctx.close();
	}
}
