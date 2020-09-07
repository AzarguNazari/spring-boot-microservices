package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.repository.MovieRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Autowired
    MovieRepository movieRepository;

    @RequestMapping
    public Iterable<Movie> getMovieInfo() {
        return movieRepository.findAll();
    }

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable Integer movieId) {
        return movieRepository.findById(movieId).orElse(null);
    }
}
