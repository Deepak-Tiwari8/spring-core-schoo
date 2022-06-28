package com.ty.spring.core.school.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring.core.school.dto.User;

@Component
public class UserDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;

	public User saveUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public boolean deleteUserById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public User getUserById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(User.class, id);
	}

	public List<User> getAllStudent() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select u From User u");
		return query.getResultList();
	}

	public User updateUser(User user) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user1 = entityManager.find(User.class, user.getId());
		if (user1 != null) {
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
			return user;
		} else
			return null;
	}
	
	public User validateUser(int id,String name)
	{
		EntityManager  entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		return null;
	}
}
