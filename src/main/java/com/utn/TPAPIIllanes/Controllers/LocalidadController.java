package com.utn.TPAPIIllanes.Controllers;

import com.utn.TPAPIIllanes.Entities.Localidad;
import com.utn.TPAPIIllanes.Servicies.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControladorImpl<Localidad, LocalidadServiceImpl>{
}
