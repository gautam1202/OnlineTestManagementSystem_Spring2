package com.cg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/** 
 * @author Jaspreet Singh Ahuja
 * @version 1.0
 * @since 03 May 2020
 * */

@Entity
public class Question implements Serializable{
	


/*	
 * Following are the data members of questions entity
 * a.questionId :BigInteger
	b.questionOptions : Array<String>
	c.questionTitle : String
	d.questionAnswer : Integer
	e.questionMarks :BigDecimal
	f.chosenAnswer : Integer 
	g.marksScored :BigDecimal
*/
	
	
	
	


	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long questionID;
	
	
	//@Column
	//private String questionOptions[]=new String[3];
	
	
	@Column
	private String option1;
	@Column
	private String option2;
	@Column
	private String option3;
	@Column
	private String option4;
	
	
	@Column
	private String questionTitle;
	@Column
	private int questionAnswer;
	@Column
	private double questionMarks;
	@Column
	private int chosenAnswer;
	@Column
	private double marksScored;
	
	
	
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public long getQuestionID() {
		return questionID;
	}
	
	
	/*
	 *this method is not required if the question ID is sequence generated 
	 * public void setQuestionID(long questionID) {
		this.questionID = questionID;
	}
	*/
	
	
	/*
	 * Use if implementing questionOptions in a array of strings
	 * 
	 * public String[] getQuestionOptions() {
		return questionOptions;
	}
	public void setQuestionOptions(String opt1, String opt2, String opt3, String opt4) {
		this.questionOptions[0]=opt1;
		this.questionOptions[1]=opt2;
		this.questionOptions[2]=opt3;
		this.questionOptions[3]=opt4;
	}
	*/
	
	
	
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public int getQuestionAnswer() {
		return questionAnswer;
	}
	public void setQuestionAnswer(int questionAnswer) {
		this.questionAnswer = questionAnswer;
	}
	public double getQuestionMarks() {
		return questionMarks;
	}
	public void setQuestionMarks(double questionMarks) {
		this.questionMarks = questionMarks;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	public double getMarksScored() {
		return marksScored;
	}
	public void setMarksScored(double marksScored) {
		this.marksScored = marksScored;
	}
	public Question(long questionID, String option1,String option2,String option3,String option4, String questionTitle, int questionAnswer,
			double questionMarks, int chosenAnswer, double marksScored) {
		super();
		this.questionID = questionID;
		/*this.questionOptions = questionOptions;*/ 		//use if questionOptions is a string[]
		this.option1=option1;
		this.option2=option2;
		this.option3=option3;
		this.option4=option4;
		
		this.questionTitle = questionTitle;
		this.questionAnswer = questionAnswer;
		this.questionMarks = questionMarks;
		this.chosenAnswer = chosenAnswer;
		this.marksScored = marksScored;
	}
	
	
	

}
