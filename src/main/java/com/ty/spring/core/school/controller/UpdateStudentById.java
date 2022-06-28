package com.ty.spring.core.school.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Student;
import com.ty.spring.core.school.service.StudentService;

public class UpdateStudentById {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		Student student1 = new Student();
		student1.setId(2);
		student1.setAddress("Bangalore");
		Student student =studentService.updateStudent(student1);

	}

}
