package com.utn.TPAPIIllanes.Repositories;

import com.utn.TPAPIIllanes.Entities.Autor;
import com.utn.TPAPIIllanes.Entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutorRepository extends BaseRepositorio <Autor, Long>{
    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    Autor buscarPorNombre(@Param("nombre") String nombre);

    @Query("SELECT a FROM Autor a WHERE  a.id = :id")
    Autor buscarPorId(@Param("id") String id);

    @Query("SELECT a FROM Autor a ORDER BY a.nombre")
    List<Autor> buscarTodos();
}
