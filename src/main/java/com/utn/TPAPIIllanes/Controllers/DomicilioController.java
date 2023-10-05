package com.utn.TPAPIIllanes.Controllers;

import com.utn.TPAPIIllanes.Entities.Domicilio;
import com.utn.TPAPIIllanes.Servicies.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController  extends BaseControladorImpl<Domicilio, DomicilioServiceImpl> {
}
