package sonu.springframework.myspring5webapp.repositories;

import sonu.springframework.myspring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;
public interface AuthorRepository extends CrudRepository<Author, Long> {
}