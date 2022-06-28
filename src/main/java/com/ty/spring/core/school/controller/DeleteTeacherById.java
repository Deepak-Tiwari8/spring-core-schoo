package com.ty.spring.core.school.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.service.TeacherService;

public class DeleteTeacherById {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		TeacherService teacherService = (TeacherService) applicationContext.getBean("teacherService");
		System.out.println("Enter Teacher ID");
		int id = in.nextInt();
		teacherService.deleteTeacherById(id);
	}

}
