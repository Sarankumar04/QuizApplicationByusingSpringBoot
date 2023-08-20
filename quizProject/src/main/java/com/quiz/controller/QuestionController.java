package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.dto.QuestionDto;
import com.quiz.service.QuestionSevice;
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionSevice qs;
	
	@GetMapping("/allquestions")
	public List<QuestionDto> allQuestions()
	{
		return qs.allQuestions();
	}
	
	@GetMapping("/category/{category}")
	public List<QuestionDto> getQuestionByCategory(@PathVariable String category)
	{
		return qs.getQuestionByCategory(category);
	}
	
	@PostMapping("/add")
	public String addQuestion(@RequestBody QuestionDto dto)
	{
		return qs.addQuestion(dto);
	}
	
	@PutMapping("/update")
	public String updateQuestion(@RequestBody QuestionDto dto)
	{
		return qs.updateQuestion(dto);
	}
	@DeleteMapping("/delete")
	public void deleteQuestion(@RequestBody QuestionDto dto)
	{
		qs.deleteQuestion(dto.getId());
	}
}
