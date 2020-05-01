package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.User;

@Transactional
@Repository

public class UserDaoImp implements IUserDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public User addUser(User u) {
		em.persist(u);
		return u;
	}

	@Override
	public List retrive() {
		Query q=em.createQuery("from User user");
		return q.getResultList();
	}

	@Override
	public User findById(long userId) {
		return em.find(User.class, userId);
	}

}
