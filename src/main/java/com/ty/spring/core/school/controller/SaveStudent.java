package com.ty.spring.core.school.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Student;
import com.ty.spring.core.school.service.StudentService;

public class SaveStudent {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("vivek");
		student.setAge(24);
		student.setGender("male");
		student.setEmail("vivek567@gmail.com");
		student.setPhone(8225098183l);
		student.setAddress("mumbai");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		Student student1 = studentService.saveStudent(student);
		if (student1 != null) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data not saved");
		}
	}

}
