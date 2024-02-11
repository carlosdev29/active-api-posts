package com.activeone.api.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activeone.api.service.IPostService;
import com.activeone.api.service.dto.PostResponseByDTO;



@RestController
@RequestMapping(value = "/post")
public class PostController {
	
	@Autowired
	private IPostService service;
	
	
	@GetMapping(value = "/getPost/{idPost}")
	public PostResponseByDTO getPostById(@PathVariable Integer idPost) {
		PostResponseByDTO postResponseByDTO = this.service.getPostByIdServ(idPost);
		return postResponseByDTO;
	}
	
	
	@GetMapping(value = "/getPost")
	public List<PostResponseByDTO> getAllPost() {
		List<PostResponseByDTO>listPost = this.service.getAllPostServ();
		return listPost;
	}
	
	


}
