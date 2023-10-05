package com.utn.TPAPIIllanes.Repositories;

import com.utn.TPAPIIllanes.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository extends BaseRepositorio <Persona,String> {

    @Query ("SELECT p FROM Persona p WHERE p.nombre = :nombre")
    Persona buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT m FROM Muelle m WHERE m.id = :id")
    Persona buscarPorId(@Param("id") String id);

    @Query("SELECT p FROM Persona p ORDER BY p.nombre")
    List<Persona> buscarTodos();


}
