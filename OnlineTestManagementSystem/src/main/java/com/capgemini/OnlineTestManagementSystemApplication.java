package com.capgemini;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.dao.*;
import com.capgemini.entity.Question;
import com.capgemini.entity.Tests;

@SpringBootApplication
public class OnlineTestManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	TestDaoImp testdao;

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestManagementSystemApplication.class, args);
		
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("Start");
	}
}*/
	
	@Override
	public void run(String... args) throws Exception {
		
		Tests t = new Tests();
		
		t.setTestTitle("SpringBoot");
		t.setTestId(105);
		t.setTestTotalMarks(50);
		t.setTestMarksScored(42);
	
		testdao.addTest(t);
		System.out.println("Test added successfully..");
		
	}
}
	
	
/*
	@Autowired
	IUserDao userDao;
	
	

	@Override
	public void run2(String... args) throws Exception {
//		User obj = new User(11615915,"shahil","12345",true,null);
//		userDao.addUser(obj);
//		System.out.println("done");
//		List<User>userList=userDao.retrive();
//		for(User u:userList) {
//			System.out.println(u.getUserId()+" "+u.getUserName()+" ");
//		}
		System.out.println(userDao.findById((long)11615915));
	}
	@Autowired
	IQuestionDao quesdao;
	

	
	@Override
	public void run3(String... args) throws Exception {
		
		/*public Question(long questionID, String[] questionOptions, String questionTitle, int questionAnswer,
				double questionMarks, int chosenAnswer, double marksScored)*/
		
		/*Question q1= new Question(2001, args, "question1" , 0, 0, 0, 0);
		quesdao.addQuestion(q1);
		
		System.out.println("question added");
		List<Question> questionlist =(List<Question>) quesdao.reterive();
		
		 for(Question ques:questionlist) { System.out.println(ques.getQuestionID()+" "+ques.getQuestionOptions()+" "+ ques.getQuestionTitle()); }
				 
				
		
		
	}


}*/
