package com.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quiz.dto.QuestionDto;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionDto, Integer> {

	List<QuestionDto> findByCategory(String category);
}
