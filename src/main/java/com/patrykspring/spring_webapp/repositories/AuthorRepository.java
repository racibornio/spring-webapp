package com.patrykspring.spring_webapp.repositories;

import com.patrykspring.spring_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
