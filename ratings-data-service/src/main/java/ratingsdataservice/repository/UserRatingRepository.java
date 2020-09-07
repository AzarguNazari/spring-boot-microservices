package ratingsdataservice.repository;

import org.springframework.data.repository.CrudRepository;
import ratingsdataservice.model.UserRating;

public interface UserRatingRepository extends CrudRepository<UserRating, Integer> {
}
