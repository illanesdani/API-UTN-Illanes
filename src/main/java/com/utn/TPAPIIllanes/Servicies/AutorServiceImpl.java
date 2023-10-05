package com.utn.TPAPIIllanes.Servicies;

import com.utn.TPAPIIllanes.Entities.Autor;
import com.utn.TPAPIIllanes.Repositories.AutorRepository;
import com.utn.TPAPIIllanes.Repositories.BaseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl
        extends BaseServicioImpl<Autor, Long>
        implements AutorService {
    @Autowired
    private AutorRepository AutorRepository;


    public AutorServiceImpl(BaseRepositorio<Autor, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}