package com.utn.TPAPIIllanes.Servicies;

import com.utn.TPAPIIllanes.Entities.BaseEntidad;
import com.utn.TPAPIIllanes.Repositories.BaseRepositorio;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
public abstract class BaseServicioImpl <E extends BaseEntidad,
        ID extends Serializable> implements BaseServicio<E,ID>{
    protected BaseRepositorio<E, ID> baseRepositorio;

    public BaseServicioImpl(BaseRepositorio<E, ID> baseRepositorio) {
        this.baseRepositorio = baseRepositorio;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> entidades = baseRepositorio.findAll();
            return entidades;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try {
            Optional<E> entidadOpcional = baseRepositorio.findById(id);
            return entidadOpcional.get();
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entidad) throws Exception {
        try {
            entidad = baseRepositorio.save(entidad);
            return entidad;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try {
            Optional<E> entidadOpcional = baseRepositorio.findById(id);
            E estudiante = entidadOpcional.get();
            estudiante = baseRepositorio.save(entity);
            return estudiante;
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try {
            if (baseRepositorio.existsById(id)) {
                baseRepositorio.deleteById(id);
                return true;
            } else {
                throw new Exception();
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}


