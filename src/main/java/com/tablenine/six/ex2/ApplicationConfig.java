package com.tablenine.six.ex2;

import com.tablenine.three.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationCTX2.xml")
public class ApplicationConfig {
	@Bean
	public Student student1() {
		Student student = new Student("홍길동", "11살", "4학년", "39번");
		return student;
	}

}
