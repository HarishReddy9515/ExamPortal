package com.boot.payload;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExaminationDTO {

	
private int examinationId;
	
    private String date;
	
    private String subjectName;
    
	private String status;  
    
	private SubjectDTO subject; 
	
	@JsonIgnore
	private List<ExamResultReportDTO> examinationReportList= new ArrayList<>();
	
	@JsonIgnore
	private List<QuestionsDTO> questionList1= new ArrayList<>();

}
