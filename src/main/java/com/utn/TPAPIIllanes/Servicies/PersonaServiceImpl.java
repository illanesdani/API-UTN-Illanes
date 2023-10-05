package com.utn.TPAPIIllanes.Servicies;

import com.utn.TPAPIIllanes.Entities.Persona;
import com.utn.TPAPIIllanes.Repositories.BaseRepositorio;
import com.utn.TPAPIIllanes.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl  extends BaseServicioImpl<Persona, Long>
        implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;
    public PersonaServiceImpl(BaseRepositorio<Persona, Long> baseRepositorio) {
        super(baseRepositorio);
    }
}
