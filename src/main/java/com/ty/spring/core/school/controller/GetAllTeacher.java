package com.ty.spring.core.school.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Teacher;
import com.ty.spring.core.school.service.TeacherService;

public class GetAllTeacher {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		TeacherService teacherService = (TeacherService) applicationContext.getBean("teacherService");
		List<Teacher> list = teacherService.getAllTeacher();
		if(list!=null)
		{
			for (Teacher teacher : list) {
				
				System.out.println(teacher);
				System.out.println("---------------------------------------");
			}
		}
		else
		{
			System.out.println("Sorry no data");
		}
	}

}
