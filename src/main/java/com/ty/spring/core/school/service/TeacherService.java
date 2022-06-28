package com.ty.spring.core.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring.core.school.dao.TeacherDao;
import com.ty.spring.core.school.dto.Teacher;
@Component
public class TeacherService {

	@Autowired
	TeacherDao teacherDao;
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);	
	}
	public boolean deleteTeacherById(int id) {
		return teacherDao.deleteTeacherById(id);
	}
	public List<Teacher> getAllTeacher() {
		return teacherDao.getAllTeacher();
	}
	public Teacher getTeacherById(int id) {
		return teacherDao.getTeacherById(id);
	}
	public Teacher updateTeacherById(Teacher teacher)
	{
		return teacherDao.updateTeacherById(teacher);
	}
}
