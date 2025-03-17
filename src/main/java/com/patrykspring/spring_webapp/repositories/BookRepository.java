package com.patrykspring.spring_webapp.repositories;

import com.patrykspring.spring_webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
