package com.boot.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.boot.entity.ExamResultReportEntity;



public interface ExamResultReportRepository  extends JpaRepository<ExamResultReportEntity,Integer> {


	/*List<ExamResultReportEntity> findByExamResultId(ExaminationEntity examinationId);
	
	 @Query(value="select * from examination_entity ec where ec.examination_entity_examination_id=:examinationId",nativeQuery =true)
     List<ExamResultReportEntity> getAllExamResultReportByexaminationId(@Param("examinationId") int examinationId);
	*/
}

