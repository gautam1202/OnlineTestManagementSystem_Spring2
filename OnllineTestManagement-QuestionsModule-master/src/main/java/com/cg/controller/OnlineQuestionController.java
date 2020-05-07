package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.*;
import com.cg.service.QuestionServiceI;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OnlineQuestionController {
    
	@Autowired
	private QuestionServiceI quesservice;
	
	public OnlineQuestionController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/")
	public String check()
	{
		return "WORKING";
	}
	
	
	  @GetMapping(value="/showallquestions")
	  public List<Question> fetchStudent()
	  {
		  return (List<Question>) quesservice.reterive();
	  }
	  
	  @GetMapping(value="/question/{questionId}")
	  public Question fetchQues(@PathVariable long questionID)
	  {
		  return quesservice.findbyId(questionID);
	  }
	  
	  @PostMapping(value="/question/add-question" ,consumes = {"application/json"})
	  public ResponseEntity<String> addStudent(@RequestBody Question question)
	  {
		  quesservice.addQuestion(question);
		  return new ResponseEntity<String>("the question is added to the test succesfully", HttpStatus.OK);
	  }
	  
	  @DeleteMapping(value = "/question/delete-question/{questionID}")
	   public ResponseEntity<String> deletestudent(@PathVariable long questionID)
	  {
		  quesservice.deleteQuestion(questionID);
		  return new ResponseEntity<String>("the question is deleted from the test succesfully", HttpStatus.OK);
	  }
	  
	  @PutMapping(value="/question/update-question/{questionID}")
	  public String updateQuestion(@PathVariable long questionID, @RequestBody Question ques)
	  {
		  quesservice.updateQuestion(questionID, ques);
		return "question updated";
				
			
	  }
	  

}
