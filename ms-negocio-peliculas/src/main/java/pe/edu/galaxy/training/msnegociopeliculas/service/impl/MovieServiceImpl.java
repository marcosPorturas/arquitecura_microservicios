package pe.edu.galaxy.training.msnegociopeliculas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.msnegociopeliculas.expose.dto.MovieResponse;
import pe.edu.galaxy.training.msnegociopeliculas.repository.MovieRepository;
import pe.edu.galaxy.training.msnegociopeliculas.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepository movieRepository;

	@Override
	public List<MovieResponse> getAllMovies() {
		// TODO Auto-generated method stub
		return movieRepository.findAll().stream()
				.map(e -> {
					MovieResponse response = new MovieResponse();
					response.setId(e.getId());
					response.setNameMovie(e.getNameMovie());
					return response;
				}).toList();
	}
	
}
