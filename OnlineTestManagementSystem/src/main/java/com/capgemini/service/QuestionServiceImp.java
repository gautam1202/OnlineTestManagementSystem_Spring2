package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.IQuestionDao;
import com.capgemini.entity.Question;

@Service
public class QuestionServiceImp implements IQuestionService {
	@Autowired
	IQuestionDao questionDao;
	
	@Override
	public void addQuestion(Question question) {
		questionDao.addQuestion(question);
		
	}

	@Override
	public List<?> reterive() {
		return questionDao.reterive();
	}

	@Override
	public Question findbyId(long questionId) {
		return questionDao.findById(questionId);
	}

	@Override
	public void deleteQuestion(long questionId) {
		questionDao.deleteQuestion(questionId);
	}

	@Override
	public void updateQuestion(long questionId) {
		questionDao.updatequestion(questionId);
		
	}

}


