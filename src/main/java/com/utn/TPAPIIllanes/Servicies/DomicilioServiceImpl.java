package com.utn.TPAPIIllanes.Servicies;

import com.utn.TPAPIIllanes.Entities.Domicilio;
import com.utn.TPAPIIllanes.Repositories.BaseRepositorio;
import com.utn.TPAPIIllanes.Repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServicioImpl<Domicilio, Long>
        implements DomicilioService{

    @Autowired
    private DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepositorio<Domicilio, Long> baseRepositorio) {

        super(baseRepositorio);
    }
}
