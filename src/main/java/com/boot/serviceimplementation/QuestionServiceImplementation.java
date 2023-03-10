package com.boot.serviceimplementation;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.boot.entity.QuestionsEntity;
import com.boot.exception.ResourceNotFoundException;

import com.boot.payload.QuestionsDTO;

import com.boot.repository.QuestionsRepository;
import com.boot.service.QuestionService;

@Service
public class QuestionServiceImplementation implements QuestionService {

	@Autowired
	private QuestionsRepository questionRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	@Override
	public QuestionsDTO addQuestion(QuestionsDTO question) {

		QuestionsEntity questionEntity =this.modelMapper.map(question,QuestionsEntity.class);
		QuestionsEntity savedquestionEntity=this.questionRepository.save(questionEntity);
		return this.modelMapper.map(savedquestionEntity,QuestionsDTO.class);
}

	@Override
	public List<QuestionsDTO> getAllQuestionList() {
		List<QuestionsEntity> questionsList =this.questionRepository.findAll();
		List<QuestionsDTO>  questionsListDto =questionsList.stream()
				                                    .map(questions->this.modelMapper.map(questions,QuestionsDTO.class)) 
				                                    .collect(Collectors.toList());

		return questionsListDto;
}

	@Override
	public QuestionsDTO getQuestionById(int questionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteQuestionById(int questionId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public QuestionsDTO updateQuestionById(QuestionsDTO question, int questionId) {
		if(this.questionRepository.existsById(questionId))
	    {
	    	QuestionsEntity questionObj= this.modelMapper.map(question, QuestionsEntity.class);
	    	QuestionsEntity updatedquestion=this.questionRepository.save(questionObj);
	    	
	    	return this.modelMapper.map(updatedquestion, QuestionsDTO.class);
	    	}
	    else
	    {
	    	throw new ResourceNotFoundException("question","questionID",questionId);
	    }
		}
	}


 