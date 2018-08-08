package sonu.springframework.myspring5webapp.repositories;

import sonu.springframework.myspring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}