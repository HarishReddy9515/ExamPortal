package com.boot.payload;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionsDTO {

	
	  private int questionId;
	   
	  private String question;
	   
	  private String option1;
	   
	  private String option2;
	   
	  private String option3;
	   
	  private String option4;
	   
	  private String answer;
	  
	  private ExaminationDTO examination;     
	     
	
	
}
