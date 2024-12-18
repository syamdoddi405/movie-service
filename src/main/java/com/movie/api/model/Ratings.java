package com.movie.api.model;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Validated
@EqualsAndHashCode
@Table
@Entity
public class Ratings {

	@Id
	@Column(name = "id")
	@JsonProperty("id")
	private Integer id;

	@Column(name = "rating")
	@JsonProperty("rating")
	private Float rating;

	@Column(name = "comment")
	@JsonProperty("comment")
	private String comment;

}
