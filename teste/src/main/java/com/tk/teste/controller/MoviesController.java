package com.tk.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tk.teste.model.Movies;
import com.tk.teste.repository.MoviesRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movies")
@CrossOrigin("*")
public class MoviesController {
	
	@Autowired
	private MoviesRepository repository;
	
	@ApiOperation(value = "consulta de todos os filmes")
	@GetMapping
	public ResponseEntity<List<Movies>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@ApiOperation(value = "consulta um filme através do id")
	@GetMapping("/{movieId}")
	public ResponseEntity<Movies> getByMovieId(@PathVariable long movieId) {
		return repository.findById(movieId).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@ApiOperation(value = "consulta um filme através de uma parte de um título")
	@GetMapping("title/{title}")
	public ResponseEntity<List<Movies>> getByTitle(@PathVariable String title) {
		return ResponseEntity.ok(repository.findAllByTitleContainingIgnoreCase(title));
	}
	
	@ApiOperation(value = "consulta um filme através de um gênero")
	@GetMapping("genres/{genres}")
	public ResponseEntity<List<Movies>> getByGenres(@PathVariable String genres) {
		return ResponseEntity.ok(repository.findAllByGenresContainingIgnoreCase(genres));
	}
	
	@ApiOperation(value = "insere um filme")
	@PostMapping
	public ResponseEntity<Movies> post(@RequestBody Movies movies){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(movies));
	}
	
	@ApiOperation(value = "alteração de um filme")
	@PutMapping
	public ResponseEntity<Movies> put (@RequestBody Movies movies){  
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(movies));
	}
	
	@ApiOperation(value = "exclui um filme através do id")
	@DeleteMapping("/{movieId}")
	public void delete(@PathVariable long movieId) {
		repository.deleteById(movieId);
	}
		 
}
