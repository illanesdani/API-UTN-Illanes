package com.utn.TPAPIIllanes.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="Localidad")
public class Localidad extends BaseEntidad{

    @Column(name="calle")
    private String denomicacion;

    @OneToMany(mappedBy = "localidad",cascade = CascadeType.PERSIST)
    private List<Domicilio> domicilios = new ArrayList<>();
}
