package com.capgemini.entity;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;
@Entity
@Table(name="test_table")
public class Tests {

	
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int testId;
	
	@Column
	private String testTitle;
	
	@OneToMany
	private Set<Question> testQuestions;
	@Column
	private double testTotalMarks;
	@Column
	private double testMarksScored;

	public long getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public Set<Question> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}

	public double getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(double testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public double getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(double testMarksScored) {
		this.testMarksScored = testMarksScored;
	}

	
}