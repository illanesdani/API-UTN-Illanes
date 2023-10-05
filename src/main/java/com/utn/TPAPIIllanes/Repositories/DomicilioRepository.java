package com.utn.TPAPIIllanes.Repositories;

import com.utn.TPAPIIllanes.Entities.Domicilio;
import com.utn.TPAPIIllanes.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DomicilioRepository extends BaseRepositorio<Domicilio, Long> {
    @Query("SELECT d FROM Domicilio d WHERE d.nombre = :nombre")
    Domicilio buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT d FROM Domicilio d WHERE d.id = :id")
    Domicilio buscarPorId(@Param("id") String id);

    @Query("SELECT d FROM Domicilio d ORDER BY d.nombre")
    List<Domicilio> buscarTodos();
}
