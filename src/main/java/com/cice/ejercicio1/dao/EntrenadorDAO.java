package com.cice.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cice.ejercicio1.model.Entrenador;

public interface EntrenadorDAO extends JpaRepository<Entrenador, Long> {

}
