package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Tests;
@Repository
@Transactional
public class TestDaoImp implements ITestDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public Tests addTest(Tests t) {
		em.persist(t);
		return t;
	
	}

	@Override
	public void deleteTest(int testId) {
		
		Tests t=em.find(Tests.class, testId);
		em.remove(t);
	}

	@Override
	public void updateTest(int testId) {
		
		Tests t1=em.find(Tests.class, testId);
		t1.setTestTitle("Java Test");
		System.out.println("Updated...");
		em.flush();
	}

	@Override
	public List<Tests> getAllTest() {
		Query query = em.createQuery("from Tests t");
		return query.getResultList();
	}

	

	
}