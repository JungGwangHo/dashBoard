package com.JGH.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JGH.domain.model.entity.Tag;

public interface TagDao extends JpaRepository<Tag, Integer> {

	Tag findByName(String tagName);
}
