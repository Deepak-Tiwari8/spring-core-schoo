package com.ty.spring.core.school.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring.core.school.dto.Teacher;
@Component
public class TeacherDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	public Teacher saveTeacher(Teacher teacher) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}

	public boolean deleteTeacherById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher teacher = entityManager.find(Teacher.class, id);
		if (teacher != null) {
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public List<Teacher> getAllTeacher() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select t From Teacher t");
		return query.getResultList();
	}

	public Teacher getTeacherById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Teacher.class, id);
	}
	
	public Teacher updateTeacherById( Teacher teacher)
	{
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher teacher1 = entityManager.find(Teacher.class, teacher.getId());
		if(teacher1!=null)
		{
			entityTransaction.begin();
			entityManager.merge(teacher);
			entityTransaction.commit();
			return teacher;
		}
		else
		return null;	
	}
}
