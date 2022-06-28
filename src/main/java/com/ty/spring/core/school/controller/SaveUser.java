package com.ty.spring.core.school.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.dto.User;
import com.ty.spring.core.school.service.UserService;

public class SaveUser {

	public static void main(String[] args) {
     User user = new User();
     user.setName("Munna");
     user.setAddress("Bihar");
     user.setEmail("munna1099@gmail.com");
     user.setGender("male");
     user.setPhone(9087678999l);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService =  (UserService)applicationContext.getBean("userService");
		User user2 = userService.saveUser(user);
		if(user2!=null)
		{
			System.out.println("Data saved");
		}
		else
		{
			System.out.println("Data not saved");
		}
     
	}

}
