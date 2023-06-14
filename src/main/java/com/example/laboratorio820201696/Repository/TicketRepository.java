package com.example.laboratorio820201696.Repository;

import com.example.laboratorio820201696.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}