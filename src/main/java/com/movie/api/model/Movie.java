package com.movie.api.model;

import java.io.Serializable;
import java.util.List;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Validated
@EqualsAndHashCode
@Table
@Entity
@Builder
public class Movie implements Serializable {

	@Id
	@Column(name ="id")
	@JsonProperty("id")
	private Integer id;

	@Column(name ="name")
	@JsonProperty("name")
	private String name;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Column(name ="rating")
	private List<Ratings> rating = null;

}
