package com.JGH.domain.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.JGH.domain.model.entity.Post;

import java.util.List;

@Repository
public class PostRepository {
	
	@PersistenceContext
	EntityManager em;
	
	public void save(Post post)
	{
		if(post.getId() == 0)
		{
			em.persist(post);
		}
		else
		{
			em.merge(post);
		}
	}
	
	public Post fineOne(int id)
	{
		return em.find(Post.class, id);
	}
	
	public List<Post> findAll()
	{
		return em.createQuery("select p from Post p", Post.class).getResultList();
	}
	
	public void remove(Post post)
	{
		em.remove(post);
	}
	
}