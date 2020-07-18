package com.dxc.movie;

import com.dxc.movie.MovieApplication;
import org.springframework.data.jpa.repository.JpaRepository;

	public interface MovieDAO  extends JpaRepository<MovieApplication, Integer>{

	}

