package com.utn.TPAPIIllanes.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="Autor")
public class Autor extends BaseEntidad{
    @Column(name="nombre")
    private String nombre;

    @Column(name="nombre")
    private String apellido;

    @Column(name="nombre")
    private String biografia;

    @ManyToMany(mappedBy = "Libro_Autor")
    List<Libro> libros;

}
