package com.example.laboratorio820201696.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ticket", schema = "lahaces")
public class Ticket {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idTipoTicket", nullable = false)
    private TipoTicketEvento idTipoTicket;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario idUsuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoTicketEvento getIdTipoTicket() {
        return idTipoTicket;
    }

    public void setIdTipoTicket(TipoTicketEvento idTipoTicket) {
        this.idTipoTicket = idTipoTicket;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

}