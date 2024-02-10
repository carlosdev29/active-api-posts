package com.activeone.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activeone.api.repository.entity.PostEntity;

@Repository
public interface IPostRepository extends JpaRepository<PostEntity, Integer> {

}
