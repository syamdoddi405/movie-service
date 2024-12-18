package com.movie.api.model;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Validated
@Data
public class MoveApiResponse {

	@JsonProperty("statusCode")
	private Integer statusCode = null;;

	@JsonProperty("statusMessage")
	private String statusMessage = null;;

	@JsonProperty("results")
	private List<Movie> results = null;

	@JsonProperty("pagination")
	private Pagination pagination = null;

}
