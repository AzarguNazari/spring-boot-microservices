package ratingsdataservice.repository;

import org.springframework.data.repository.CrudRepository;
import ratingsdataservice.model.Rating;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
