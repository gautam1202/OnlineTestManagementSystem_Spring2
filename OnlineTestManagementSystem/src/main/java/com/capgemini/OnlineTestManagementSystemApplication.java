package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.dao.*;

@SpringBootApplication
public class OnlineTestManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	ResultDaoImp resdao;

	public static void main(String[] args) {
		SpringApplication.run(OnlineTestManagementSystemApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Start");
		
	}
}
