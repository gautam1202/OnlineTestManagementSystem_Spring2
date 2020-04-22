package com.capgemini.service;
import java.math.BigDecimal;
import com.capgemini.entity.Tests;


public interface IResultService {
	public BigDecimal getResult(Tests test);
	public BigDecimal calculateTotalMarks();
	
	}

