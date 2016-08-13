package com.JGH.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JGH.domain.model.entity.Category;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}
