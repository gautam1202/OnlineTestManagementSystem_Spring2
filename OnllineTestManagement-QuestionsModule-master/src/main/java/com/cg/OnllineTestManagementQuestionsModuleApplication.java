package com.cg;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.QuestionDaoI;
import com.cg.entity.Question;



@SpringBootApplication
public class OnllineTestManagementQuestionsModuleApplication implements CommandLineRunner {
	
	@Autowired
	QuestionDaoI quesdao;
	

	public static void main(String[] args) {
		SpringApplication.run(OnllineTestManagementQuestionsModuleApplication.class, args);
			
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * ********************************************************************
		 * This is just for testing persistence
		 * 
		 * 
		public Question(long questionID, String[] questionOptions, String questionTitle, int questionAnswer,
				double questionMarks, int chosenAnswer, double marksScored)
		
		//LocalTime localTime,startTime,endTime;
		
		Question ques1= new Question(2001, "opt1","opt1","opt1","opt1", "question1" , 5, 10, 15, 20);
		
		//List<User> userlist=(List<User>quesdao.reterive());
		//User user1=new User();
		//Test test1= new Test(1001, "this is question1",localTime, 50,25, startTime, endTime, user, questionlist);
		//User user2= new User(101, "User1", "password1", true, test1);
		//quesdao.addQuestion(test1, ques1);
		quesdao.addQuestion(ques1);
		System.out.println("question added");
		
		
		List<Question> questionlist =(List<Question>) quesdao.reterive();
		 for(Question ques:questionlist) { System.out.println(ques.getQuestionID()+" "+ques.getOption1()+" "+ ques.getQuestionTitle()); }
				
		
	******************************************************************************
				*/
		
		
	}

}
