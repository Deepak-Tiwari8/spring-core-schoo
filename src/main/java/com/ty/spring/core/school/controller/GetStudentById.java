package com.ty.spring.core.school.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Student;
import com.ty.spring.core.school.service.StudentService;

public class GetStudentById {

	public static void main(String[] args) {
  
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
		Student student = studentService.getStudent(2);
		if(student!=null)
		{
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getEmail());
		}
		else {
			System.out.println("Sorry id is not present");
		}
	}

}
