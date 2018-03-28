package com.tablenine.six;

import com.tablenine.three.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main6 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Student student1 = ctx.getBean("student1", Student.class);
		Student student2 = ctx.getBean("student2", Student.class);

		System.out.println(student1.getName());
		System.out.println(student2.getName());

		ctx.close();
	}
}

