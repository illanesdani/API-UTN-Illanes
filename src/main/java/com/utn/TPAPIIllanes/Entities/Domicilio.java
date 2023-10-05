package com.utn.TPAPIIllanes.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="domicilio")
public class Domicilio extends BaseEntidad{

    @Column(name="calle")
    private String calle;

    @Column(name="numero")
    private int numero;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

    @ManyToOne(cascade = CascadeType.PERSIST, optional = false)
    @JoinColumn(name = "fk_persona")
    private Persona persona;
}
