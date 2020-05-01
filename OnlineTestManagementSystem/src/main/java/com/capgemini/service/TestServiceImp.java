package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.ITestDao;
import com.capgemini.entity.Tests;

@Service
	public class TestServiceImp implements ITestService {
		
		@Autowired
		ITestDao testdao;

		@Override
		public Tests addTest(Tests t) {

			return testdao.addTest(t);
		}

		@Override
		public void deleteTest(int testId) {

			testdao.deleteTest(testId);
		}

		@Override
		public void updateTest(int testId) {
			testdao.updateTest(testId);
		}

		@Override
		public List<Tests> getAllTest() {
			return testdao.getAllTest();
		}

	}


