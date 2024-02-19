package pe.edu.galaxy.training.msnegociopeliculas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.msnegociopeliculas.entity.MovieEntity;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity,Integer>{

}
