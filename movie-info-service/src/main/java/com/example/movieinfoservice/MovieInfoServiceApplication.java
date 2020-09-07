package com.example.movieinfoservice;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoServiceApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

	@Autowired
	MovieRepository movieRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Arrays.asList(
					new Movie(1, "Titanic", "A historical movie about"),
					new Movie(2, "3 Idiots", "A movie about college life"))
				.forEach(movieRepository::save);
	}
}

