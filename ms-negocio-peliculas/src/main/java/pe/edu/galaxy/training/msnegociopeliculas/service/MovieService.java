package pe.edu.galaxy.training.msnegociopeliculas.service;

import java.util.List;

import pe.edu.galaxy.training.msnegociopeliculas.expose.dto.MovieResponse;

public interface MovieService {
	
	List<MovieResponse> getAllMovies();

}
