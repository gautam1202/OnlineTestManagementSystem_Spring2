package com.capgemini.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import com.capgemini.dao.*;
import com.capgemini.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ResultServiceImp implements IResultService {
	
	@Autowired
	IResultDao dao;
	
	
	@Override
	public List<?> reterive() {
		return dao.reterive();
	}

	@Override
	public Tests findbyId(BigInteger testID) {
		return dao.findById(testID);
	}
	
	
		@Override
		public double getResult(Tests test)
		{
			double totalMarks = new Double(0);
			HashSet<Question> questions = (HashSet<Question>) test.getTestQuestions();
					Iterator<Question> it = questions.iterator();
			while (it.hasNext()) {
			Question question = it.next();
			totalMarks = totalMarks + question.getMarksScored();
					//add(question.getMarksScored());
			}
			return getResult(test);
		}

	
	@Override
	public double calculateTotalMarks() {
		Tests test = new Tests ();
		List<Question> testQuestions = (List<Question>) test.getTestQuestions();
		Iterator<Question> testQuestionIterator = testQuestions.iterator();
		double testTotalMarks = new Double(0);
		while(testQuestionIterator.hasNext())
		{
			Question nextQuestion = testQuestionIterator.next();
			testTotalMarks +=nextQuestion.getMarksScored();
					//add(nextQuestion.getMarksScored());
			test.setTestTotalMarks(testTotalMarks);
		
	}
		return calculateTotalMarks();
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*if( User.isAdmin != true) {
	return dao.getResult(test);
	}
	else {
	throw new NotStudentException("Only student can give the test");

	}
	}

	void validateUserId(long userId) {
	if (userId <= 0) {
	throw new IncorrectIdException("User id is null");
	}
	}

	void validatetestId(BigInteger testId) {
	if ( testId.equals(null)) {
	throw new IncorrectIdException("test id is null");
	}
	}
}

	void validatequestionId(BigInteger questionId) {
	if ( questionId.equals(null)) {
	throw new IncorrectIdException("question id is null");
	}
	}
	*/
	


