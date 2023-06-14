package com.example.laboratorio820201696.Repository;

import com.example.laboratorio820201696.Entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
}