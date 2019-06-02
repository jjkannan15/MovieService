package com.hackerrank.jsonmock.movieservice.domain;

import java.util.function.Consumer;

public class MovieBuilder {
	
	public MovieBuilder with(
            Consumer<MovieBuilder> builderFunction) {
        builderFunction.accept(this);
        return this;
    }
	
	public Movie build() {
        return new Movie(poster, title, type, year, imdb);
    }
	
	public String poster;
	
	public String title;
	
	public String type;
	
	public int year;
	
	public String imdb;
	
}