package com.utn.TPAPIIllanes.Servicies;

import com.utn.TPAPIIllanes.Entities.Libro;
import com.utn.TPAPIIllanes.Repositories.BaseRepositorio;
import com.utn.TPAPIIllanes.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServicioImpl<Libro, Long>
        implements LibroService{

    @Autowired
    private LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepositorio<Libro, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}
