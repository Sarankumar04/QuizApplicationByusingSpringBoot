package com.quiz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.QuestionDao;
import com.quiz.dao.QuizDao;
import com.quiz.dto.QuestionDto;
import com.quiz.dto.QuizDto;

@Service
public class QuizService {

	@Autowired
	QuizDao dao;
	
	@Autowired
	QuestionDao questionDao;
	
	public void createQuiz(String category, int numq, String title) {
		
		List<QuestionDto> d=questionDao.findByQuestionByCategory(category,numq);
		
		QuizDto quiz=new QuizDto();
		quiz.setTitle(title);
		quiz.setDto(d);
		
		dao.createQuiz(quiz);
	}
}
