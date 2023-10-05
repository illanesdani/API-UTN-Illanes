package com.utn.TPAPIIllanes.Controllers;

import com.utn.TPAPIIllanes.Entities.BaseEntidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseControlador <E extends BaseEntidad, ID extends Serializable> {
    public ResponseEntity<?> findAll() ;

    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entidad);
    public ResponseEntity<?> update(@PathVariable ID id, @PathVariable E entidad);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
