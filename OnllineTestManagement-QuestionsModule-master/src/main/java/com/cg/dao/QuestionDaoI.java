package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Question;


@Repository
public interface QuestionDaoI {
	
    //Question addQuestion(Test test, Question question);
	//public Question updateQuestion(Question question);
	public Question deleteQuestion(long questionId);
	
	public Question findById(long questionId);
	public List<Question> reterive();
	Question addQuestion(Question question);
	public boolean isAdmin();
	public Question updateQuestion(Question question);
	
	
}
