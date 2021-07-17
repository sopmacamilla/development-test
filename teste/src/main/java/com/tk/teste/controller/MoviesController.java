package com.tk.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tk.teste.repository.MoviesRepository;

@RestController
@RequestMapping("/movies")
@CrossOrigin("*")
public class MoviesController {
	
	@Autowired
	private MoviesRepository repository;
	
}
