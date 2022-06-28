package com.ty.spring.core.school.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Student;
import com.ty.spring.core.school.service.StudentService;

public class GetAllStudent {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		List<Student> list = studentService.getAllStudent();
		if (list != null) {
			for (Student student : list) {
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println("------------------------------------");
			}
		} else {
			System.out.println("sorry Student data is not there");
		}
	}

}
