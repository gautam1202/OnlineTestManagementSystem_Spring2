package com.capgemini.service;

import java.math.BigDecimal;
import com.capgemini.dao.*;
import com.capgemini.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImp implements IResultService {
	
	@Autowired
	IResultDao dao;
	
	public ResultServiceImp(IResultDao dao) 
	{
		this.dao = dao;
	}
	
	
	@Override
	public BigDecimal getResult(Tests test)
	{
		return dao.getResult(test);
	}
	@Override
	public BigDecimal calculateTotalMarks() {
		return dao.calculateTotalMarks();
		
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
	


