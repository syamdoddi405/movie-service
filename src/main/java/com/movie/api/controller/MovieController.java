package com.movie.api.controller;

import java.util.List;
import java.util.Optional;

import com.movie.api.mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.movie.api.data.reporitory.MovieRepository;
import com.movie.api.model.Movie;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	MovieMapper movieMapper;

	@PostMapping(value = "/movie")
	public ResponseEntity<Movie> postMovie(@RequestBody @Valid Movie movie) {
		return new ResponseEntity<>(movieRepository.save(movie), HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "/movies")
	public ResponseEntity<List<Movie>> getMovies() {
		return new ResponseEntity<>(movieRepository.findAll(), HttpStatus.OK);
	}

	@PatchMapping(value = "/movie/{id}")
	public ResponseEntity<Movie> patchMovie(@RequestBody Movie movie, @PathVariable("id") Integer id){
		Optional<Movie> movieUpdate = movieRepository.findById(id);
		if (movieUpdate.isPresent()) {
			Movie mov =movieRepository.save(movieMapper.toMovie(movie));
			return new ResponseEntity<>(mov, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);	}

	@GetMapping(value = "/movie/{id}")
	public ResponseEntity<Movie> getMovies(@PathVariable("id") Integer id) {
		Optional<Movie> movie = movieRepository.findById(id);
		if (movie.isPresent()) {
			return new ResponseEntity<>(movie.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

}
