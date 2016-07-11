package com.JGH.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JGH.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {

}
