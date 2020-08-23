package com.example.movieinfoservice.resources;

import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        return getMovie(movieId);
    }

    public Movie getMovie(String movieId){
        if(movieId.equals("titanic")) return new Movie("titanic", "Titanic Movie", "A historic movie of separation and love");
        if(movieId.equals("3idiot")) return new Movie("3idiot", "3 Idiots", "A movie about students struggle during college");
        return null;
    }
}
