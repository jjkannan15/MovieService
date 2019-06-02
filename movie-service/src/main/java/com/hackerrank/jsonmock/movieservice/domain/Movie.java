package com.hackerrank.jsonmock.movieservice.domain;

public class Movie {
	
	public Movie(String poster, String title, String type, int year, String imdb) {
		this.poster = poster;
		this.title = title;
		this.type = type;
		this.year = year;
		this.imdb = imdb;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	private String poster;
	
	private String title;
	
	private String type;
	
	private int year;
	
	private String imdb;
	
}