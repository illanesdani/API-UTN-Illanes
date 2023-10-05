package com.utn.TPAPIIllanes.Repositories;

import com.utn.TPAPIIllanes.Entities.Libro;
import com.utn.TPAPIIllanes.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibroRepository extends BaseRepositorio <Libro, Long>{
    @Query("SELECT l FROM Libro l WHERE l.nombre = :nombre")
    Libro buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT l FROM Libro l WHERE l.id = :id")
    Libro buscarPorId(@Param("id") String id);

    @Query("SELECT l FROM Libro l ORDER BY l.nombre")
    List<Libro> buscarTodos();
}
