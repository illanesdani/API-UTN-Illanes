package com.utn.TPAPIIllanes.Controllers;

import com.utn.TPAPIIllanes.Entities.Persona;
import com.utn.TPAPIIllanes.Servicies.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControladorImpl<Persona, PersonaServiceImpl>{


}
