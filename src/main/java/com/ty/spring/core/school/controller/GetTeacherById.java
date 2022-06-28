package com.ty.spring.core.school.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Teacher;
import com.ty.spring.core.school.service.TeacherService;

public class GetTeacherById {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		TeacherService teacherService = (TeacherService) applicationContext.getBean("teacherService");
		System.out.println("Enter Teacher Id ");
		int id = in.nextInt();
		Teacher teacher = teacherService.getTeacherById(id);
		if (teacher != null) {
			System.out.println(teacher);
		} else {
			System.out.println("Sorry this for no data better luck next");
		}
	}

}
