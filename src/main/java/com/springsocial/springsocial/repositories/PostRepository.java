package com.springsocial.springsocial.repositories;

import com.springsocial.springsocial.entities.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> { }
