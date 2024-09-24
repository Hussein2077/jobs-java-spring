  package com.example.jobs.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.jobs.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {

    Post findByProfile(String profile);

    Post findByTechs(String[] techs);
     
}