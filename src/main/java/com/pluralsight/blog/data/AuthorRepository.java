package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false) //this will block Authors API, no output at http://localhost:8080/authors
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
