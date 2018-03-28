package com.tablenine.six.ex1;

import com.tablenine.three.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Student student1() {
		Student student = new Student("홍길동", "11살", "4학년", "39번");
		return student;
	}

}
