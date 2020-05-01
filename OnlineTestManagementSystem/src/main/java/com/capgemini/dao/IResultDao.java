	package com.capgemini.dao;

	import java.math.BigDecimal;
import java.math.BigInteger;
	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	import com.capgemini.entity.Question;
import com.capgemini.entity.Tests;

	@Repository
	public interface IResultDao 
	{
		public Tests findById(BigInteger testID);
		public List reterive();
		

	}
	
