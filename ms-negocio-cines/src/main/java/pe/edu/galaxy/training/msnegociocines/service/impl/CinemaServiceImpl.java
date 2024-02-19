package pe.edu.galaxy.training.msnegociocines.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.galaxy.training.msnegociocines.expose.dto.CinemaResponse;
import pe.edu.galaxy.training.msnegociocines.repository.CinemaRepository;
import pe.edu.galaxy.training.msnegociocines.service.CinemaService;

@Service
public class CinemaServiceImpl implements CinemaService{

	@Autowired
	CinemaRepository cinemaRepository;
	
	@Override
	public List<CinemaResponse> getAllCinemas() {
		// TODO Auto-generated method stub
		return cinemaRepository.findAll().stream()
				.map(e -> {
					CinemaResponse response = new CinemaResponse();
					response.setId(e.getId());
					response.setNameCinema(e.getNameCinema());
					return response;
				}).toList();
	}

	
	
}
