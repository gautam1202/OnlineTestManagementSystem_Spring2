package com.capgemini.dao;

	import java.math.BigInteger;
	import java.util.List;

	import org.springframework.stereotype.Repository;

import com.capgemini.entity.Question;
	@Repository
	public interface IQuestionDao {

		public Question addQuestion(Question question);
		public Question updatequestion(long questionId);
		public Question deleteQuestion(long questionId);		
		public Question findById(long questionId);
		public List reterive();
	}


