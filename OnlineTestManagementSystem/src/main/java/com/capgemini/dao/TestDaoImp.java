package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Tests;

@Transactional
@Repository
public class TestDaoImp implements ITestDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Tests t) {
		em.persist(t);
	
	}

	
}
