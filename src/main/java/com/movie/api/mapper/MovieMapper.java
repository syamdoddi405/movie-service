package com.movie.api.mapper;

import com.movie.api.model.Movie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    Movie toMovie(Movie movie);
}
