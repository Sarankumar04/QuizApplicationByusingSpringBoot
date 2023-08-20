package com.quiz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quiz.dto.QuizDto;
import com.quiz.repository.QuizRepository;

@Component
public class QuizDao {

	@Autowired
	QuizRepository repo;

	public void createQuiz(QuizDto dto) {
		repo.save(dto);
	}
}
