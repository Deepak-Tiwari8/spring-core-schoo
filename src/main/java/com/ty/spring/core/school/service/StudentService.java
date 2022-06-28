package com.ty.spring.core.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring.core.school.dao.StudentDao;
import com.ty.spring.core.school.dto.Student;

@Component
public class StudentService {

	@Autowired
	StudentDao studentDao;
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	public boolean deleteStudentById(int id)
	{
		return studentDao.deleteStudentById(id);
	}
	
	public Student getStudent(int id)
	{
		return studentDao.getStudent(id);
	}
	
	public List<Student> getAllStudent()
	{
		return studentDao.getAllStudent();
	}
	public Student updateStudent(Student student) {
		return studentDao.updateStudent(student);
	}
}
