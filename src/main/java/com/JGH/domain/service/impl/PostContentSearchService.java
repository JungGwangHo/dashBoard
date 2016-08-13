package com.JGH.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import com.JGH.domain.model.entity.Post;
import com.JGH.domain.repository.PostSearchRepository;
import com.JGH.domain.service.PostSearchService;

@Service("contents")
public class PostContentSearchService implements PostSearchService {

	@Autowired
	private PostSearchRepository postSearchRepository;

	@Override
	public Page<Post> findPost(String query, Pageable pageable) {

		return postSearchRepository.findPostByContent(HtmlUtils.htmlEscape(query), pageable);
	}
}
