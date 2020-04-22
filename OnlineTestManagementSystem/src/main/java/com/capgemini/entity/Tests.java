package com.capgemini.entity;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sun.istack.NotNull;

@Entity
@Repository
@Table(name="TestTable")
@EnableTransactionManagement
public class Tests {

	
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long testID;
	@OneToMany
	private Set<Question> testQuestions;
	@Column
	private BigDecimal testTotalMarks;
	@Column
	private BigDecimal testMarksScored;
	
	@OneToOne
	@JoinColumn(name="questionId")
	private Question q;

	public long getTestID() {
		return testID;
	}

	public void setTestID(long testID) {
		this.testID = testID;
	}

	public Set<Question> getTestQuestions() {
		return testQuestions;
	}

	public void setTestQuestions(Set<Question> testQuestions) {
		this.testQuestions = testQuestions;
	}

	public BigDecimal getTestTotalMarks() {
		return testTotalMarks;
	}

	public void setTestTotalMarks(BigDecimal testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}

	public BigDecimal getTestMarksScored() {
		return testMarksScored;
	}

	public void setTestMarksScored(BigDecimal testMarksScored) {
		this.testMarksScored = testMarksScored;
	}
	public Question getQuestions() {
		return q;
	}

	public void setQuestions(Question questions) {
		this.q = questions;
	}


	public Tests(long testID, Set<Question> testQuestions, BigDecimal testTotalMarks, BigDecimal testMarksScored) {
		super();
		this.testID = testID;
		this.testQuestions = testQuestions;
		this.testTotalMarks = testTotalMarks;
		this.testMarksScored = testMarksScored;
	}

	
}