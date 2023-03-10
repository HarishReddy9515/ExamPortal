package com.boot.payload;

import java.util.ArrayList;
import java.util.List;


import com.boot.entity.EnrolledCourseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class CourseDTO {
	
	  private int courseId;
      
      private String courseName;
  
      private int courseFee;
       
      @JsonIgnore
      private List<EnrolledCourseEntity> enrolledcourseList=new ArrayList<>();
      
      @JsonIgnore 
      private List<SubjectDTO> subjectList=new ArrayList<>();
   
      
}
