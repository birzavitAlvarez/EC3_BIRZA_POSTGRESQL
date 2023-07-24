package com.birzavit.ec3.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "instrumento")
public class Instrumento {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)//SEQUENCE
    @Column(name = "id_instrumento",nullable = false)
    private Integer id;

    @Column(name = "nombre_instrumento", nullable=false,length=40)
    private String nombre;

    // relacion muchos a uno
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Instrumento() {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
   
}
