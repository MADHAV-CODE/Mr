package com.dxc.movie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxc.movie.MovieDAO;
import com.dxc.movie.MovieApplication;

@Service
public class MovieService {
	
	@Autowired 
	MovieDAO moviedao;
	
	public Optional <MovieApplication> getMovieApplicationById(int id ) {
		return this.moviedao.findById(id);
	}
	public MovieApplication addMovieApplication(MovieApplication moviee) {
		return this.moviedao.save(moviee);
	}
	public MovieApplication  updateMovieApplicationById(MovieApplication moviee) {
		return this.moviedao.save(moviee);
	}
	public void DeleteMovieApplicationById(int id) {
		this.moviedao.deleteById(id);
	}
	public void DeleteAllMovieApplications() {
		this.moviedao.deleteAll();
	}
	public List<MovieApplication> getAllMovieApplications(){
		return this.moviedao.findAll();
		
	}
}

