package com.JGH.presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JGH.domain.model.entity.Member;
import com.JGH.infrastructure.dao.MemberDao;

@RestController
public class MemberRestController {

	@Autowired
	private MemberDao memberDao;

	@RequestMapping("/add")
	public Member add(Member meber) {

		Member meberData = memberDao.save(meber);

		return meberData;
	}

	@RequestMapping("/list")
	public List<Member> list(Model model) {

		List<Member> meberList = memberDao.findAll();

		return meberList;
	}

	@RequestMapping("/test")
	public String index() {
		return "helloworld!";
	}
}