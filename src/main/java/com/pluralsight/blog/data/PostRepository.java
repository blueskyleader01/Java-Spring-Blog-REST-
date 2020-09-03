package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long>{
    @RestResource(rel="contains-title", path="containsTitle")
    public List<Post> findByTitleContaining(String title);
    //for search post by title, in url http://localhost:8080/posts/search/findByTitleContaining?title=string
    //if don't want the path to be too long, redefine it by using @RestResource(rel="contains-title", path="containsTitle")

};
