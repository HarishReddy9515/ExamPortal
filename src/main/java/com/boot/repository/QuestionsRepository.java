package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.entity.QuestionsEntity;

public interface QuestionsRepository extends JpaRepository<QuestionsEntity, Integer>
{
   
}
