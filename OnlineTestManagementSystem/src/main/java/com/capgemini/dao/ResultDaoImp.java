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




@Transactional
@Repository

public class ResultDaoImp implements IResultDao{
	
	@PersistenceContext
	EntityManager em;


	@Override
	public BigDecimal getResult(Tests test)
	{
		em.persist(test);
		BigDecimal totalMarks = new BigDecimal(0);
		HashSet<Question> questions = (HashSet<Question>) test.getTestQuestions();
		Iterator<Question> it = questions.iterator();
		while (it.hasNext()) {
		Question question = it.next();
		totalMarks = totalMarks.add(question.getMarksScored());
		}
		return totalMarks;
		}

	
	@Override
	public Tests findById(BigInteger testID) {
		return em.find(Tests.class, testID);
	}

	@Override
	public List reterive() {
		Query q=em.createQuery("from TestTable question");
		return q.getResultList();
	}

	@Override
	public BigDecimal calculateTotalMarks() {
		Tests test = new Tests(0, null, null, null);
		Set<Question> testQuestions = test.getTestQuestions();
		Iterator<Question> testQuestionIterator = testQuestions.iterator();
		BigDecimal testTotalMarks = new BigDecimal(0);
		while(testQuestionIterator.hasNext())
		{
			Question nextQuestion = testQuestionIterator.next();
			testTotalMarks = testTotalMarks.add(nextQuestion.getMarksScored());
			test.setTestTotalMarks(testTotalMarks);
		}
		return test.getTestTotalMarks();
		
	}
	}


	
	