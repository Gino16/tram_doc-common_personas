package com.tramite_documentario.microservicio.backend.commonpersonas.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "puestos")
public class Puesto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_puesto;

    private String nombre;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "puesto")
    private Persona persona;

    public Long getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(Long id_puesto) {
        this.id_puesto = id_puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
