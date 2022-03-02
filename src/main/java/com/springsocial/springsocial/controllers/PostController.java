package com.springsocial.springsocial.controllers;


import com.springsocial.springsocial.entities.Posts;
import com.springsocial.springsocial.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;


@RestController
@RequestMapping("/api/v1/post")
public class PostController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/{postId}")
    public Posts getPost(@PathVariable("postId") Long postId) {
        return postRepository.getById(postId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void addPost(@RequestBody Posts post){
        post.setUploadDate(new Date(new java.util.Date().getTime()));
        postRepository.save(post);
    }
}
