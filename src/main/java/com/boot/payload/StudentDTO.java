package com.boot.payload;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@ToString
	public class StudentDTO {

	     private int studentId;
	     
	     private String studentName;
	     
	     private String studentQualification;
	     
	     private int studentAge;
	     
	     private String studentEmail;
	     
	     private String studentPassword;
	     
         private String studentMobileNumber;	     
	     
      //   @JsonIgnore
      //   private List<EnrolledCoursesEntity> studentList=new ArrayList<>();

 
}


