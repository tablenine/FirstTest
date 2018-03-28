package com.tablenine.five;

import com.tablenine.three.Student;
import com.tablenine.three.StudentInfo;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main5 {
	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX.xml";
		String configLocation2 = "classpath:applicationCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation, configLocation2);

		Student student1 = ctx.getBean("student1", Student.class);
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		Student student2 = studentInfo.getStudent();

		Student student3 = ctx.getBean("student3", Student.class);
		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		ctx.close();
	}
}

