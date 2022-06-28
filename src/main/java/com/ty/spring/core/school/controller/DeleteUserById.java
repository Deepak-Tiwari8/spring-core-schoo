package com.ty.spring.core.school.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.MyConfig;
import com.ty.spring.core.school.service.UserService;

public class DeleteUserById {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
    UserService userService = (UserService)applicationContext.getBean("userService");
    System.out.println("Enter User Id");
    int  id = in.nextInt();
    userService.deleteUserById(id);
	}
}
