package com.birzavit.ec3.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "id_categoria",nullable = false)
    private Integer id;

    @Column(name = "nombre_categoria",nullable=false,length=50)
    private String nombre;

    // relacion uno a muchos
    @OneToMany(targetEntity = Instrumento.class, mappedBy = "categoria")
    private Set<Instrumento> instrumento = new HashSet<Instrumento>();

    public Categoria() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Instrumento> getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Set<Instrumento> instrumento) {
        this.instrumento = instrumento;
    }

    
}
