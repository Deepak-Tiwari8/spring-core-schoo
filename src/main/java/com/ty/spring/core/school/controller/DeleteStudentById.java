package com.ty.spring.core.school.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Student;
import com.ty.spring.core.school.service.StudentService;

public class DeleteStudentById {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		StudentService studentService = (StudentService) applicationContext.getBean("studentService");
       boolean student = studentService.deleteStudentById(1);
      
       
	}

}
