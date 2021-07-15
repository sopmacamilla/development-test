package com.tk.teste.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tk.teste.model.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long>{
	public List<Movies> findAllByTitleContainingIgnoreCase (String title);
	
	public List<Movies> findAllByGenresContainingIgnoreCase (String genres);
}
