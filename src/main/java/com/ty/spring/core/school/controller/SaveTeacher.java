package com.ty.spring.core.school.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.Teacher;
import com.ty.spring.core.school.service.TeacherService;

public class SaveTeacher {

	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setName("Deepak");
		teacher.setEmail("deepaktiwari7226@gmail.com");
		teacher.setAddress("USA");
		teacher.setPhone(8225098183l);
		teacher.setSubject("Spring");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		TeacherService teacherService = (TeacherService) applicationContext.getBean("teacherService");
		Teacher teacher1 = teacherService.saveTeacher(teacher);
		if (teacher1 != null) {
			System.out.println("Data saved");
		} else {
			System.out.println("Data is not saved");
		}
	}

}
