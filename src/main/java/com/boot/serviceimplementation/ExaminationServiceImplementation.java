package com.boot.serviceimplementation;


import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.entity.ExaminationEntity;

import com.boot.exception.ResourceNotFoundException;

import com.boot.payload.ExaminationDTO;

import com.boot.repository.ExaminationRepository;

import com.boot.service.ExaminationService;

@Service
public class ExaminationServiceImplementation implements ExaminationService
{
	   @Autowired 
	  private ExaminationRepository examinationRepository;
	   
	 //  @Autowired
	   //private ExamResultReportRepository examResultReportRepository; 
	  
	   @Autowired
	   private ModelMapper modelMapper;

	   
	@Override
	public ExaminationDTO addExamination(ExaminationDTO examination) {
		

		ExaminationEntity examinationEntity =this.modelMapper.map(examination,ExaminationEntity.class);
		ExaminationEntity savedexaminationEntity=this.examinationRepository.save(examinationEntity);
		return this.modelMapper.map(savedexaminationEntity,ExaminationDTO.class);
	}

	@Override
	public List<ExaminationDTO> getAllExaminationList() {
		List<ExaminationEntity> examinationList =this.examinationRepository.findAll();
		List<ExaminationDTO>  examinationListDto = examinationList.stream()
				                                    .map(examination->this.modelMapper.map(examination,ExaminationDTO.class)) 
				                                    .collect(Collectors.toList());

		return examinationListDto;
}

	@Override
	public ExaminationDTO getExaminationById(int examinationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteExaminationById(int examinationId) {
		if(this.examinationRepository.existsById(examinationId))
		{
			this.examinationRepository.deleteById(examinationId);
		}
		else
		{
			throw new ResourceNotFoundException("examination","examinationID", examinationId);	
		}

	}


	@Override
	public ExaminationDTO updateexaminationById(ExaminationDTO examination, int examinationId) {
		 if(this.examinationRepository.existsById(examinationId))
		    {
			 ExaminationEntity examinationObj= this.modelMapper.map(examination, ExaminationEntity.class);
			 ExaminationEntity updatedexamination=this.examinationRepository.save(examinationObj);
		    	
		    	return this.modelMapper.map(updatedexamination, ExaminationDTO.class);
		    	}
		    else
		    {
		    	throw new ResourceNotFoundException("examination","examinationID",examinationId);
		    }
			}

	/*@Override
	public List<ExaminationDTO> getAllExaminationByexamReportId(int examReportId) {
		if(this.examResultReportRepository.existsById(examReportId))
		{
		// TODO Auto-generated method stub
		List<ExaminationEntity> examinationList =this.examinationRepository.getAllExaminationByExamResultId(examReportId);	 
    	List<ExaminationDTO> examinationDTOList =examinationList.stream()
    	   .map(enrolledCourse ->this.modelMapper.map(enrolledCourse, ExaminationDTO.class))
    	   .collect(Collectors.toList());
    	
    	
    	return examinationDTOList;
    	
    	
    	}
    else
    {
    	throw new ResourceNotFoundException("examResultReport","exmReportID",examReportId);
    }
	}*/



}


