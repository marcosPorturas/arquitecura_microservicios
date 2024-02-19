package pe.edu.galaxy.training.msnegociopeliculas.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.msnegociopeliculas.expose.dto.MovieResponse;
import pe.edu.galaxy.training.msnegociopeliculas.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/all")
	public List<MovieResponse> getAllMovies() {
		return movieService.getAllMovies();
	}

}
