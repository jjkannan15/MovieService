package com.hackerrank.jsonmock.movieservice.domain;

import java.util.List;

public class MovieDetails {
	
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public List<Movie> getData() {
		return data;
	}

	public void setData(List<Movie> data) {
		this.data = data;
	}
	
	int page;

	int per_page;
	
	int total;
		
	int totalPages;
	
	List<Movie> data;
}
