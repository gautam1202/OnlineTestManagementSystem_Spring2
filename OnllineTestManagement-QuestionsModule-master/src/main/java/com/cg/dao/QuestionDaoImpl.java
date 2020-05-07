package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Question;




@Repository

public class QuestionDaoImpl implements QuestionDaoI{
	
	@PersistenceContext
	EntityManager entityManager;


	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		entityManager.persist(question);
		return question;
	}
		
	/*
	@Override
	public Question addQuestion(Test test, Question question) {
		// TODO Auto-generated method stub
		entityManager.persist(test);
		entityManager.persist(question);
		return question;
	}
	*/
	@Override
	public Question findById(long questionId) {
		return entityManager.find(Question.class, questionId);
	}
	

	@Override
	public List<Question> reterive() {
		Query queryObj=entityManager.createQuery("from Question question");
		return queryObj.getResultList();
		
		
	}
	
	
	@Override
	public Question updateQuestion( Question question) {
	
		
		/*	a.questionId :BigInteger
			b.questionOptions : Array<String>
			c.questionTitle : String
			d.questionAnswer : Integer
			e.questionMarks :BigDecimal
			f.chosenAnswer : Integer 
			g.marksScored :BigDecimal
		*/
			
		/*Question ques= entityManager.find(Question.class, questionId);
		
		ques.setChosenAnswer(1);
		ques.setMarksScored(0);
		ques.setQuestionAnswer(1);
		//ques.setQuestionID(1001);
		ques.setQuestionMarks(5);
		//ques.setQuestionOptions("opt1","opt2","opt3","opt4");
		ques.setOption1("opt1new");
		ques.setOption2("opt2new");
		ques.setOption3("opt3new");
		ques.setOption4("opt4");
		ques.setQuestionTitle("questionTitleNew");
		entityManager.flush();
		
		return ques;*/
		
		return entityManager.merge(question);
		
		
	}

	@Override
	public Question deleteQuestion(long questionId) {
		// TODO Auto-generated method stub
		Question ques =entityManager.find(Question.class, questionId);
		entityManager.remove(ques);
		System.out.println("the question has been deleted.");
		return ques;
	}

	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
