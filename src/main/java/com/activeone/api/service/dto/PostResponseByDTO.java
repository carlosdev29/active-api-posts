package com.activeone.api.service.dto;

import java.util.Date;

public class PostResponseByDTO {
	
	private Integer postId;
	private String postName;
	private Date creationDate;
	private Date updateDate;
	
	private StatusResponseDTO statusResponse;
	
	
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public StatusResponseDTO getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(StatusResponseDTO statusResponse) {
		this.statusResponse = statusResponse;
	}
	
	

}
