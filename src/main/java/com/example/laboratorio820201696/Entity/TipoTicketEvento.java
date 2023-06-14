package com.example.laboratorio820201696.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_ticket_evento", schema = "lahaces")
public class TipoTicketEvento {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "precio", length = 45)
    private String precio;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idEvento", nullable = false)
    private Evento idEvento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Evento getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Evento idEvento) {
        this.idEvento = idEvento;
    }

}