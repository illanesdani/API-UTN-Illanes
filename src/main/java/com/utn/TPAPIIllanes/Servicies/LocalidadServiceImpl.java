package com.utn.TPAPIIllanes.Servicies;

import com.utn.TPAPIIllanes.Entities.Localidad;
import com.utn.TPAPIIllanes.Repositories.BaseRepositorio;
import com.utn.TPAPIIllanes.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServicioImpl<Localidad, Long>
        implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepositorio<Localidad, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}
