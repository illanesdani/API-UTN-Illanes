package com.utn.TPAPIIllanes.Controllers;

import com.utn.TPAPIIllanes.Entities.Autor;
import com.utn.TPAPIIllanes.Servicies.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public abstract class AutorController extends BaseControladorImpl<Autor, AutorServiceImpl>{
}
