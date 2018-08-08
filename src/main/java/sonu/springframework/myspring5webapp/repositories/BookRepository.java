package sonu.springframework.myspring5webapp.repositories;

import sonu.springframework.myspring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {
}
