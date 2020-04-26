package com.capgemini.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Question;




@Transactional
@Repository

public class QuestionDaoImp implements IQuestionDao
	{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Question addQuestion(Question question) {
		em.persist(question);
		return question;
	}

	@Override
	public Question updatequestion(long questionId) {
Question ques= em.find(Question.class, questionId);
		
		ques.setChosenAnswer(1);
		ques.setMarksScored(new BigDecimal(0));
		ques.setQuestionAnswer(1);
		ques.setQuestionID(1001);
		ques.setQuestionMarks(5);
		ques.setQuestionTitle("questionTitle");
		
		return ques;
	}

	@Override
	public Question deleteQuestion(long questionId) {
		return null;
	}

	@Override
	public Question findById(long questionId) {
		return em.find(Question.class, questionId);
	}

	@Override
	public List reterive() {
		Query q=em.createQuery("from QuestionTable question");
		return q.getResultList();
	}

}


	
	