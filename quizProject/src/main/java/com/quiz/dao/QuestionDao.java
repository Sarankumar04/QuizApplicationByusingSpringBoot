package com.quiz.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quiz.dto.QuestionDto;
import com.quiz.repository.QuestionRepository;

@Component
public class QuestionDao {

	@Autowired
	QuestionRepository repo;
	
	public List<QuestionDto> allQuestions()
	{
	  List<QuestionDto>	dto=repo.findAll();
	  return dto;
	}
	public List<QuestionDto> getQuestionByCategory(String category)
	{
		List<QuestionDto> dto	=repo.findByCategory(category);
		return dto;
	}
	public String addQuestion(QuestionDto dto)
	{
		repo.save(dto);
		return "Question Added Successfully";
	}
	public String updateQuestion(QuestionDto dto)
	{
		repo.save(dto);
		return "Question updated";
	}
	public Optional<QuestionDto> fetchQById(int id)
	{
	Optional<QuestionDto>	dto=repo.findById(id);
	return dto;
	}
	public String deleteQuestion(int id)
	{
		repo.deleteById(id);
		return "Question Deleted Sucessfully";
	}
	public List<QuestionDto> findByQuestionByCategory(String category, int numq) {
	
		return null;
	}
	
}
