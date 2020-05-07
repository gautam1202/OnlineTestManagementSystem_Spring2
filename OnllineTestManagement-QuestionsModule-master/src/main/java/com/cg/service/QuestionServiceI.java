package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Question;

@Service
public interface QuestionServiceI {

	public Question addQuestion(Question question);
	public List<Question> reterive();
	public Question findbyId(long questionId);
	public Question deleteQuestion(long questionId);
	public Question updateQuestion(long questionID ,Question updatedQuestion);

}