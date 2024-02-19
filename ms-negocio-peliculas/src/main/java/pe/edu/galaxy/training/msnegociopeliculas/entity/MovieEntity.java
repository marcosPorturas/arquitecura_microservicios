package pe.edu.galaxy.training.msnegociopeliculas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tbl_movies")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieEntity {
	
	@Id
	private Integer id;
	private String nameMovie;

}
