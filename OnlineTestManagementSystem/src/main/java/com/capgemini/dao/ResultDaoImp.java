package com.capgemini.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Question;
import com.capgemini.entity.Tests;

@Repository

public class ResultDaoImp implements IResultDao{
	
	@PersistenceContext
	EntityManager em;

	
	@Override
	public Tests findById(BigInteger testID) {
		return em.find(Tests.class, testID);
	}

	@Override
	public List reterive() {
		Query q=em.createQuery("from TestTable question");
		return q.getResultList();
	}

	}


	
	