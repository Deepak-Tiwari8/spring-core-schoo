package com.ty.spring.core.school.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.User;
import com.ty.spring.core.school.service.UserService;

public class GetAllUser {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService =  (UserService)applicationContext.getBean("userService");
		List<User> list = userService.getAllStudent();
		if(list!=null)
		{
			for (User user : list) {
				System.out.println(user);
				System.out.println("-----------------------------------");
			}
		}
		else
		{
			System.out.println("Sorry User table no data there");
		}
	}

}
