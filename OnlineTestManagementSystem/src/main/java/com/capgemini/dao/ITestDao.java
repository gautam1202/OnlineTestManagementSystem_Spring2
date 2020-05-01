package com.capgemini.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.*;

@Repository
public interface ITestDao {


	
	public Tests addTest(Tests t);
	
    public void deleteTest(int testId);
	
	public void updateTest(int testId);
	
	public List<Tests> getAllTest();
	
	

}
	

	
	

