package com.activeone.api.repository.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tbl_posts")
public class PostEntity {
	
	@Id
	@Column(name = "id_posts")
	private Integer id;
	
	@Column(name = "titulo")
	private String tittle;
	
	@Column(name = "contenido")
	private String content;
	
	@Column(name = "fecha_crecion")
	private Date creationDate;
	
	@Column(name = "fecha_actualizacion")
	private Date updateDate ;
	
	@ManyToOne
	@JoinColumn(name = "id_categorias")
	private CategoryEntity cateogry;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

}
