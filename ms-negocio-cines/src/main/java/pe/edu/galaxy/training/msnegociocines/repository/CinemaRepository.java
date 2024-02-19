package pe.edu.galaxy.training.msnegociocines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.galaxy.training.msnegociocines.entity.CinemaEntity;

@Repository
public interface CinemaRepository extends JpaRepository<CinemaEntity,Integer>{

}
