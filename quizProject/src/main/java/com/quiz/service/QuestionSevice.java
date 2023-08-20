package com.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuestionDao;
import com.quiz.dto.QuestionDto;

@Service
public class QuestionSevice {

	@Autowired
	QuestionDao dao;
	
	public List<QuestionDto> allQuestions()
	{
		List<QuestionDto> dto	=dao.allQuestions();
		if(dto.isEmpty())
			return null;
		else
			return dto;
	}
	public List<QuestionDto> getQuestionByCategory(String category)
	{
		List<QuestionDto> dto	=dao.getQuestionByCategory(category);
		if(dto.isEmpty())
			return null;
		else
			return dto;
	}
	public String addQuestion(QuestionDto dto)
	{
		return dao.addQuestion(dto);
	}
	public String updateQuestion(QuestionDto dto)
	{
		return dao.updateQuestion(dto);
	}
	public String deleteQuestion(int id)
	{
		Optional<QuestionDto> dto=dao.fetchQById(id);
		if(dto.isPresent())
		{
		QuestionDto dt	=dto.get();
		return dao.deleteQuestion(dt.getId());
		}
		else
			return "No Question Found";
	}
}
