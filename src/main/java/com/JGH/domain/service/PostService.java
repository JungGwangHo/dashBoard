package com.JGH.domain.service;

import com.JGH.domain.model.entity.Post;
import com.JGH.domain.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class PostService {
	
	@Autowired
	PostRepository postRepository;
	
	public void removePost(Post post)
	{
		postRepository.remove(post);
	}
	public void savePost(Post post)
	{
		postRepository.save(post);
	}
	
	public Post findOne(int PostId)
	{
		return postRepository.fineOne(PostId);
	}
	public List<Post> findPost() 	
	{
		return postRepository.findAll();
	}
	
}
