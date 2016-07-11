
package com.JGH.presentation.controller;

import com.JGH.domain.model.entity.Post;
import com.JGH.domain.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PostController {

	@Autowired 
	PostService postService;	
	//, method = RequestMethod.GET
	@RequestMapping("/list")
	public String PostList(Model model)
	{
		List<Post> posts = postService.findPost();
		model.addAttribute("postlist", posts);
		return "/posts/postList";
	}
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String form(Post post) {
		return "/hello";
	}
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(Model model)
	{
		return "/write";
	}
	
	@RequestMapping(value = "/write")
	public String insertpost(@ModelAttribute("post") Post post, Model model)
	{
		postService.savePost(post);
		return "redirect:/list";
	}
	
	@RequestMapping(value = "/posts/postDetail.do")
	public String postDetail(@ModelAttribute("post") Post post, Model model)
	{
		int postId = post.getId();
		Post posts = postService.findOne(postId);
		model.addAttribute("postlist", posts);
		return "/posts/postDetail";
	}
	
	@RequestMapping(value = "/update",  method = RequestMethod.POST)
	public String openpostUpdate(@ModelAttribute("post") Post post, Model model)
	{
		int postId = post.getId();
		Post posts = postService.findOne(postId);
		model.addAttribute("postlist", posts);
		return "/update";
	}
	
	@RequestMapping(value = "/update" ,method = RequestMethod.GET)
	public String postUpdate(@ModelAttribute("post") Post post, Model model)
	{
		postService.savePost(post);
		return "redirect:/list";
	}
	
	@RequestMapping(value = "/delete")
	public String postDelete(@ModelAttribute("list") Post post, Model model)
	{
		int postId = post.getId();
		System.out.println(postId);
		Post post2 = postService.findOne(postId);
		postService.removePost(post2);
		return "redirect:/list";
	}
}
