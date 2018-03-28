package com.tablenine.nine.ex1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main9_1 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX9.xml");

		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();

		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();
		ctx.close();
	}
}
