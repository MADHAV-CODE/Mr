package com.dxc.movie;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dxc.movie.MovieApplication;
import com.dxc.movie.MovieService;

@RestController 
@RequestMapping("/Movie")
public class MovieController {
	
	@Autowired MovieService movieservice;
	
	@RequestMapping(name="/getMovieById", method=RequestMethod.GET)
	public Optional <MovieApplication> getMovieApplication(@PathVariable int id ){
		return this.movieservice.getMovieApplicationById(id);
		}
	@RequestMapping(name="/addMovie", method=RequestMethod.POST)
	public MovieApplication addMovieApplication(@RequestBody MovieApplication moviee) {
		return this.movieservice.addMovieApplication(moviee);
		}
	@RequestMapping(name="/UpdateMovieById", method=RequestMethod.PUT)
	public MovieApplication updateMovieApplicationById(@RequestBody MovieApplication moviee){
		return this.movieservice.updateMovieApplicationById(moviee);
		}
	@RequestMapping(name="/DeleteMovieById", method=RequestMethod.DELETE)
	public void DeleteMovieApplicationById(@PathVariable int id ){
		 this.movieservice.DeleteMovieApplicationById(id);
		}
	@RequestMapping(name="/DeleteAllMovies", method=RequestMethod.DELETE)
	public void DeleteAllMovieApplications( ){
		 this.movieservice.DeleteAllMovieApplications();
	}
	
	@RequestMapping(name="/All",  method=RequestMethod.GET)
	public List<MovieApplication> getAllMovies(){
		return this.movieservice.getAllMovieApplications();
		}
}
