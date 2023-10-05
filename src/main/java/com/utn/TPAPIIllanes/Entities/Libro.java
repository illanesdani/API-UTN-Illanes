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
@Table(name="Libro")
public class Libro extends BaseEntidad{
    @Column(name="nombre")
    private String titulo;

    @Column(name="nombre")
    private int fecha;

    @Column(name="nombre")
    private String genero;

    @Column(name="nombre")
    private int paginas;

    @Column(name="nombre")
    private String autor;

    @ManyToOne
    private List<Persona> personas;

@ManyToMany()
@JoinTable(
            name="Libro_Autor",
            joinColumns = @JoinColumn(name="libro_id"),
            inverseJoinColumns = @JoinColumn (name="persona_id")
    )
    List<Autor> autores;

}
