package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.QuestionDaoI;
import com.cg.entity.Question;
import com.cg.exception.AccessDeniedException;
import com.cg.exception.NullException;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionServiceI {
	@Autowired
	QuestionDaoI questionDao;
	
	
	/*********************************************************************************************************************
	 * Method: addQuestion Description: Persists a new row for question table
	 * 
	 * @param question:
	 *            A parameter of type Question(entity)
	 * 
	 * @returns question: this sets the data into the newly created row
	 * 
	 * @throws AccessDeniedException:
	 *             is raised if a user who isn't a administrator tries to add the question
	 *              
	 * Created By - Jaspreet Singh Ahuja
	 * 
	 ***********************************************************************************************************************/
	
	
	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		if (questionDao.isAdmin()!= true)
			throw new AccessDeniedException("Only a admin can enter a question");
		
		return questionDao.addQuestion(question);
		
	}
	
	
	

	@Override
	public List<Question> reterive() {
		return questionDao.reterive();
	}
	
	

	@Override
	public Question findbyId(long questionId) {
		// TODO Auto-generated method stub
		return questionDao.findById((long) questionId);
	}

	
	/*********************************************************************************************************************
	 * Method: deleteQuestion Description: Transaction from question table to delete the question
	 * 									    respective to the passed questionId
	 * 
	 * @param questionId:
	 *            long type id from Question(entity)
	 * 
	 * @returns questionId: the respective row with questionId is removed
	 * 
	 * @throws AccessDeniedException:
	 *             is raised if a user who isn't a administrator tries to add the question
	 *              
	 * Created By - Jaspreet Singh Ahuja
	 * 
	 ***********************************************************************************************************************/
	
	@Override
	public Question deleteQuestion(long questionId) {
		if (questionDao.isAdmin()!= true)
			throw new AccessDeniedException("Only a admin can delete a question");
		return questionDao.deleteQuestion((long) questionId);
	}
	
	

	/*********************************************************************************************************************
	 * Method: updateQuestion Description: Transaction from question table to update existing question
	 * 									    respective to the passed questionId
	 * 
	 * @param questionId:
	 *            long type id from Question(entity)
	 * 
	 * @returns questionId: the data of respective questionId is updated in the same row
	 * 
	 * @throws AccessDeniedException:
	 *             is raised if a user who isn't a administrator tries to add the question
	 *              
	 * Created By - Jaspreet Singh Ahuja
	 * 
	 ***********************************************************************************************************************/
	
	@Override
	public Question updateQuestion(long questionId, Question updatedQuestion) {
		
		if (questionDao.isAdmin()!= true)
			throw new AccessDeniedException("Only a admin can update a question");
		
		//return questionDao.updateQuestion((long) questionId);
	
		   Question ques= questionDao.findById(questionId);
		   ques=updatedQuestion;
		   return questionDao.updateQuestion(ques);
		
	}

}
