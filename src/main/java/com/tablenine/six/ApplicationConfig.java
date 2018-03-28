package com.tablenine.six;

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

	@Bean
	public Student student2() {
		Student student = new Student("홍길돔", "8살", "1학년", "12번");
		return student;
	}
}
