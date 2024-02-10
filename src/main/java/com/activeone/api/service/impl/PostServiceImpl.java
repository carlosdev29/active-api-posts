package com.activeone.api.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activeone.api.repository.IPostRepository;
import com.activeone.api.repository.entity.PostEntity;
import com.activeone.api.service.IPostService;
import com.activeone.api.service.dto.PostRequestByDTO;
import com.activeone.api.service.dto.PostRequestUpdDTO;
import com.activeone.api.service.dto.PostResponseByDTO;
import com.activeone.api.service.dto.PostResponseSavedDTO;
import com.activeone.api.service.dto.StatusResponseDTO;



@Service
public class PostServiceImpl implements IPostService {
	
	@Autowired
	private IPostRepository repository;
	
	
	

	@Override
	public List<PostResponseByDTO> getAllPostServ() {
		PostResponseByDTO postResponseByDTO = 
				new PostResponseByDTO();
		StatusResponseDTO statusResponseDTO = new StatusResponseDTO();
		List<PostResponseByDTO>postResponseByList =
				new ArrayList<>();
		List<PostEntity>postList = this.repository
				.findAll();
		
		if (postList.size()>0) {
			statusResponseDTO.setCod("200");
			statusResponseDTO.setMessage("OK");
		}else {
			statusResponseDTO.setCod("203");
			statusResponseDTO.setMessage("data not found db");
			postResponseByDTO.setStatusResponse(statusResponseDTO);
			postResponseByList.add(postResponseByDTO);
			return postResponseByList;
		}
		for (PostEntity postEntity : postList) {
			postResponseByDTO.setPostId(postEntity.getId());
			postResponseByDTO.setCreationDate(postEntity.getCreationDate());
			postResponseByDTO.setUpdateDate(postEntity.getUpdateDate());
			postResponseByList.add(postResponseByDTO);
		}
		
		postResponseByDTO.setStatusResponse(statusResponseDTO);
		postResponseByList.add(postResponseByDTO);
		
		return postResponseByList;
	}
	
	
	@Override
	public PostResponseByDTO getPostByIdServ(Integer id) {
		PostResponseByDTO postResponseByDTO = 
				new PostResponseByDTO();
		StatusResponseDTO statusResponseDTO = new StatusResponseDTO();
		PostEntity postEntity = this.repository
				.findById(id).orElse(null);
		
		Optional<PostEntity>postEntityData =
				Optional.ofNullable(postEntity);
		if (postEntityData.isPresent()) {
			statusResponseDTO.setCod("200");
			statusResponseDTO.setMessage("OK");
			postResponseByDTO.setStatusResponse(statusResponseDTO);
			postResponseByDTO.setPostId(postEntity.getId());
			postResponseByDTO.setCreationDate(postEntity.getCreationDate());
			postResponseByDTO.setUpdateDate(postEntity.getUpdateDate());
		} else {
			statusResponseDTO.setCod("200");
			statusResponseDTO.setMessage("OK");
			postResponseByDTO.setStatusResponse(statusResponseDTO);
		}
		return postResponseByDTO;
	}
	
	
	@Override
	public PostResponseSavedDTO savePost(PostRequestByDTO postRequestByDTO) {
		PostResponseSavedDTO carCategoryResponseSavedDTO = 
				new PostResponseSavedDTO();
		StatusResponseDTO statusResponseDTO = new StatusResponseDTO();
		Date date = new Date();
		//Timestamp timestamp = new Timestamp(date.getTime());
		PostEntity categoryEntity = new PostEntity();
		categoryEntity.setCreationDate(date);
		PostEntity responseCategory = this.repository
				.save(categoryEntity);
		statusResponseDTO.setCod("201");
		statusResponseDTO.setMessage("OK");
		carCategoryResponseSavedDTO.setIdCategory(responseCategory.getId());
		carCategoryResponseSavedDTO.setStatusResponseDTO(statusResponseDTO);
		return carCategoryResponseSavedDTO;
	}
	
	
	@Override
	public PostResponseSavedDTO updatePost(PostRequestUpdDTO postRequestUpdDTO, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
