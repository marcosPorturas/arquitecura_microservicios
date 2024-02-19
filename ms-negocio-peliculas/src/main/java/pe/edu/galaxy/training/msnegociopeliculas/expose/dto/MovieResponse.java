package pe.edu.galaxy.training.msnegociopeliculas.expose.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
	
	private Integer id;
	private String nameMovie;

}
