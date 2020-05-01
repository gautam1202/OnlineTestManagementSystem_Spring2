  
package com.capgemini.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Tests;
import com.capgemini.service.ResultServiceImp;

@RestController

public class ResultController {
	@Autowired
	ResultServiceImp resultserviceimp;
	
	public ResultController()
	{
		
	}
	
	@RequestMapping("/")
	public String check() {
		return "WORKING";
	}
	 
	@GetMapping("/getresult")
	public ResponseEntity<Double> getResult(@RequestBody Tests test)
	{
		double result=resultserviceimp.getResult(test);
		return new ResponseEntity<Double>(result,HttpStatus.OK);
	
	}
	
	
	@GetMapping("/totalmarks")
	public ResponseEntity<Double> calculateTotalMarks(@RequestBody Tests test)
	{
		double totalresult=resultserviceimp.calculateTotalMarks();
		return new ResponseEntity<Double>(totalresult,HttpStatus.OK);
	
	}
	  
  }