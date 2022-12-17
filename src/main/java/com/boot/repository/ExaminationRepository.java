package com.boot.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.ExaminationEntity;



public interface ExaminationRepository  extends JpaRepository<ExaminationEntity,Integer>{

	/*List<ExaminationEntity> findByExamResultId(ExamResultReportEntity examResultId);
	 
	
	 @Query(value="select * from exam_result_report_entity er where er.examination_report_list_exam_result_id=:examResultId",nativeQuery =true)
     List<ExaminationEntity> getAllExaminationByExamResultId(@Param("examResultId") int examResultId);
	*/
}
