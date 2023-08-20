package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.quiz.dto.QuestionDto;
import com.quiz.dto.QuizDto;

@Repository
public interface QuizRepository extends JpaRepository<QuizDto,Integer> {
	@Query(value = "select * from QuestionDto q where q.category=:category order by random() limit:numq",nativeQuery = true)
	List<QuestionDto> findByQuestionByCategory(String category, int numq);
}
