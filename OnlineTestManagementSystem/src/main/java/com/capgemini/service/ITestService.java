package com.capgemini.service;

import java.util.List;

import com.capgemini.entity.Tests;

public interface ITestService {
    public Tests addTest(Tests t );
	
	public void deleteTest(int testId );
	
	public void updateTest(int testId);

	public List<Tests> getAllTest();


}
