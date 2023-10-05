package com.utn.TPAPIIllanes.Repositories;

import com.utn.TPAPIIllanes.Entities.BaseEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

public interface BaseRepositorio <E extends BaseEntidad,
        ID extends Serializable>
        extends JpaRepository<E, ID> {
}
