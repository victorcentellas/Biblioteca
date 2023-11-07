package es.uclm.Biblioteca.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import es.uclm.Biblioteca.domain.entities.Ejemplar;
import es.uclm.Biblioteca.domain.entities.Titulo;


@Repository
public interface EjemplarDAO extends JpaRepository<Ejemplar, Integer>{
	@Query(value = "SELECT * FROM DERBYUSER.ejemplar WHERE ISBN_TITULO=?",nativeQuery = true)
    public List<Ejemplar> findByIsbn(Titulo titulo);
   
}
