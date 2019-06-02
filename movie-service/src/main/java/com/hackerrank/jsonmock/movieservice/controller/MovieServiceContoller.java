package com.hackerrank.jsonmock.movieservice.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hackerrank.jsonmock.movieservice.domain.MovieDetails;
import com.hackerrank.jsonmock.movieservice.service.MovieProcesserService;

@RestController
@RequestMapping("/movie-service/api/movies")
public class MovieServiceContoller {

	@Autowired
	MovieProcesserService movieProcessorService;
	
	@GetMapping("/search")
	public MovieDetails getAll(@RequestParam("title") String title,@RequestParam("page") int page ) throws IOException {
		return movieProcessorService.getAll(title, page);
	}
	
}
