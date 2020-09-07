package ratingsdataservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import ratingsdataservice.model.Rating;
import ratingsdataservice.model.UserRating;
import ratingsdataservice.repository.RatingRepository;
import ratingsdataservice.repository.UserRatingRepository;

import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
public class RatingsDataServiceApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
	}


	@Autowired
	RatingRepository ratingRepository;

	@Autowired
	UserRatingRepository userRatingRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Rating rating1 = new Rating(1, 4.5);
		Rating rating2 = new Rating(2, 4.0);

		ratingRepository.save(rating1);
		ratingRepository.save(rating2);

		UserRating userRating = new UserRating(1, Arrays.asList(rating1, rating2));

		userRatingRepository.save(userRating);

		userRatingRepository.findAll().forEach(user -> {
			System.out.println(user.getUserId());
		});

		ratingRepository.findAll().forEach(rating -> {
			System.out.println(rating.getMovieId() + " => " + rating.getRating());
		});
	}
}

