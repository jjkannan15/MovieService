package com.hackerrank.jsonmock.movieservice.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

import org.springframework.stereotype.Component;

import com.hackerrank.jsonmock.movieservice.domain.Movie;
import com.hackerrank.jsonmock.movieservice.domain.MovieBuilder;
import com.hackerrank.jsonmock.movieservice.domain.MovieDetails;

@Component
public class MovieProcesserService {
	
	List<Movie> data = new ArrayList(Arrays.asList(new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "SpiderMan";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "SpiderMan3";
		movieBuilder.type = "movie";
		movieBuilder.year = 2010;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "SpiderMan5";
		movieBuilder.type = "movie";
		movieBuilder.year = 2011;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "SuperMan";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Italian Spiderman";
		movieBuilder.type = "movie";
		movieBuilder.year = 2009;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Amazing Spiderman Syndrome";
		movieBuilder.type = "movie";
		movieBuilder.year = 2008;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "The Amazing Spiderman T4 Premiere Special";
		movieBuilder.type = "movie";
		movieBuilder.year = 2006;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "The Death of Spiderman";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Hollywood's Master Storytellers: Spiderman Live";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Spiderman and Grandma";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Spiderman in Cannes";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Superman, Spiderman or Batman";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Fighting, Flying and Driving: The Stunts";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "They Call Me Spiderman";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "Spiderman the photographer";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build(), new MovieBuilder().with(movieBuilder -> {
		movieBuilder.poster = "NA";
		movieBuilder.title = "the prestige";
		movieBuilder.type = "movie";
		movieBuilder.year = 2001;
		movieBuilder.imdb = "th4559";
	}).build()));
	
	public MovieDetails getAll(String movieName, int page) throws IOException {
		List<Movie> filterMovie = data.stream().filter(movie -> movie.getTitle().contains(movieName))
				.sorted(Comparator.comparing(Movie::getTitle)).collect(Collectors.toList());
		int startIndex = 0;
		int endIndex = filterMovie.size() > 10 ? 10 : filterMovie.size();
		if(page>1) {
			startIndex = (page -1)*10;
			endIndex = (page * 10) > filterMovie.size() ? filterMovie.size() : (page * 10);
		}
		return populateMovieDetail(page, filterMovie, startIndex, endIndex);
	}

	private MovieDetails populateMovieDetail(int page, List<Movie> filterMovie, int startIndex, int endIndex) {
		MovieDetails movieDetail=  new MovieDetails();
		movieDetail.setData(filterMovie.subList(startIndex, endIndex));
		movieDetail.setPage(page);
		movieDetail.setPer_page(10);
		movieDetail.setTotal(filterMovie.size());
		movieDetail.setTotalPages((filterMovie.size()+10-1)/10);
		return movieDetail;
	}
	
	
}