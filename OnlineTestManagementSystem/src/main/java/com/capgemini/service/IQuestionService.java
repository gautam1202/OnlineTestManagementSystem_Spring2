
package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.entity.Question;

@Service
public interface IQuestionService {

	public void addQuestion(Question question);
	public List<?> reterive();
	public Question findbyId(long questionId);
	public void deleteQuestion(long questionId);
	public void updateQuestion(long questionID);

}