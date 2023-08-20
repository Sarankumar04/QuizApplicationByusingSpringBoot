package com.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	@Autowired
	QuizService qs;
	
	@PostMapping("/create")
	public void createQuiz(@RequestParam String category,@RequestParam int numq,@RequestParam String title)
	{
		qs.createQuiz(category,numq,title);
	}
}
