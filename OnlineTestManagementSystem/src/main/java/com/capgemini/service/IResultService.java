package com.capgemini.service;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import com.capgemini.entity.Tests;


public interface IResultService {
	public double getResult(Tests test);
	public double calculateTotalMarks();
	Tests findbyId(BigInteger testID);
	List reterive();
	
	}

