package com.JGH.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JGH.domain.model.entity.Member;

public interface MemberDao extends JpaRepository<Member, Integer> {

}
