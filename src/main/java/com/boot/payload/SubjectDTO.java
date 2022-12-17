package com.boot.payload;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class SubjectDTO {
	
    private int subjectId;
	
	private String subjectName;
     
	private String subjectDiscription;
   
	private CourseDTO course;
    
	@JsonIgnore
	 private List<ExaminationDTO> examList=new ArrayList<>();

}
