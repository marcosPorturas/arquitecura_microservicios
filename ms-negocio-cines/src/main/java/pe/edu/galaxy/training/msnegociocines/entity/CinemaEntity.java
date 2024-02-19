package pe.edu.galaxy.training.msnegociocines.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tbl_cinemas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CinemaEntity {
	
	@Id
	private Integer id;
	private String nameCinema;

}
