package com.example.jobs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.jobs.repo.PostRepository;

import jakarta.servlet.http.HttpServletResponse;
import com.example.jobs.model.Post;

import java.io.IOException;


@RestController
public class PostController {
    @Autowired
    PostRepository  repo  ;
    @GetMapping("/")
    public void redirectToSwagger(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui/index.html");
    } 
    @GetMapping("/posts")
    public  List<Post>   getPosts() {
        return  repo.findAll();
    }
    
}
