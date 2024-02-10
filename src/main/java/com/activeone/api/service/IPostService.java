package com.activeone.api.service;

import java.util.List;

import com.activeone.api.service.dto.PostRequestByDTO;
import com.activeone.api.service.dto.PostRequestUpdDTO;
import com.activeone.api.service.dto.PostResponseByDTO;
import com.activeone.api.service.dto.PostResponseSavedDTO;

public interface IPostService {
	
	public PostResponseByDTO getPostByIdServ(Integer id);
	
	public List<PostResponseByDTO> getAllPostServ();
	
	public PostResponseSavedDTO savePost(
			PostRequestByDTO postRequestByDTO);
	
	public PostResponseSavedDTO updatePost(
			PostRequestUpdDTO postRequestUpdDTO, Integer id);

}
