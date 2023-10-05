package com.utn.TPAPIIllanes.Repositories;

import com.utn.TPAPIIllanes.Entities.Localidad;
import com.utn.TPAPIIllanes.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalidadRepository extends BaseRepositorio<Localidad,Long>{
    @Query("SELECT l FROM Localidad l WHERE l.nombre = :nombre")
    Localidad buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT l FROM Localidad l WHERE l.id = :id")
    Localidad buscarPorId(@Param("id") String id);

    @Query("SELECT l FROM Localidad l ORDER BY l.nombre")
    List<Localidad> buscarTodos();
}
