package ratingsdataservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import ratingsdataservice.model.Rating;
import ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ratingsdataservice.repository.RatingRepository;
import ratingsdataservice.repository.UserRatingRepository;

@RestController
@RequestMapping(value = "/ratings", produces = MediaType.APPLICATION_JSON_VALUE)
public class RatingsResource {

    @Autowired
    UserRatingRepository userRatingRepository;

    @Autowired
    RatingRepository ratingRepository;

    @RequestMapping("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable Integer movieId) {
        return ratingRepository.findById(movieId).orElse(null);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable Integer userId) {
        return userRatingRepository.findById(userId).orElse(null);
    }
}
