package com.utn.TPAPIIllanes.Controllers;

import com.utn.TPAPIIllanes.Entities.Libro;
import com.utn.TPAPIIllanes.Servicies.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControladorImpl<Libro, LibroServiceImpl> {
}
