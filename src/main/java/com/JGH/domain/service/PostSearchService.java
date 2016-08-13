package com.JGH.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.JGH.domain.model.entity.Post;

public interface PostSearchService {

	Page<Post> findPost(String query, Pageable pageable);
}
