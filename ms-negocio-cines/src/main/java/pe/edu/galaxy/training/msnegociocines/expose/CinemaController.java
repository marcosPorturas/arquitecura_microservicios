package pe.edu.galaxy.training.msnegociocines.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.galaxy.training.msnegociocines.expose.dto.CinemaResponse;
import pe.edu.galaxy.training.msnegociocines.service.CinemaService;

@RestController
@RequestMapping("/cinema")
public class CinemaController {

	@Autowired
	CinemaService cinemaService;
	
	@GetMapping("/all")
	public List<CinemaResponse> getAllCinemas(){
		return cinemaService.getAllCinemas();
	}
	
}
