package com.capgemini.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.*;

@Transactional
@Repository
public interface ITestDao {


	void create(Tests t);
	

	
	

}
