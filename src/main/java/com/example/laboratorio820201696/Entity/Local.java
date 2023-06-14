package com.example.laboratorio820201696.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "local", schema = "lahaces")
public class Local {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "direccion", length = 45)
    private String direccion;

    @Column(name = "latitud", length = 45)
    private String latitud;

    @Column(name = "longitud", length = 45)
    private String longitud;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idEmpresa", nullable = false)
    private Empresa idEmpresa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

}