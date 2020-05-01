  
package com.capgemini.controller;



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

import com.capgemini.entity.*;
import com.capgemini.service.IQuestionService;


//@CrossOrigin(origins="http://localhost:4200")
@RestController
public class QuestionController {
    
	@Autowired
	private IQuestionService quesservice;
	
	public QuestionController() {
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
	  public String addStudent(@RequestBody Question question)
	  {
		  quesservice.addQuestion(question);
		  return "question has been added";
	  }
	  
	  @DeleteMapping(value = "/question/delete-question/{questionID}")
	   public String deletestudent(@PathVariable long questionID)
	  {
		  quesservice.deleteQuestion(questionID);
		  return "Question has been deleted";
	  }
	  
	  @PutMapping(value="/question/update-question/{questionID}")
	  public String updateQuestion(@PathVariable long questionID)
	  {
		  quesservice.updateQuestion(questionID);
		  return "question has been updated";
	  }
	  

}