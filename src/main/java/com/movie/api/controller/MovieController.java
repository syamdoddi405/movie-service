package com.movie.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.api.data.reporitory.MovieRepository;
import com.movie.api.model.Movie;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	MovieRepository movieRepository;

	@PostMapping(value = "/movie")
	public ResponseEntity<Movie> postMovie(@RequestBody @Valid Movie movie) {
		return new ResponseEntity<>(movieRepository.save(movie), HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/movies")
	public ResponseEntity<List<Movie>> getMovies() {
		return new ResponseEntity<>(movieRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping(value = "/movie/{id}")
	public ResponseEntity<Movie> getMovies(@PathVariable("id") Integer id) {
		Optional<Movie> movie = movieRepository.findById(id);
		if (movie.isPresent()) {
			return new ResponseEntity<>(movie.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
