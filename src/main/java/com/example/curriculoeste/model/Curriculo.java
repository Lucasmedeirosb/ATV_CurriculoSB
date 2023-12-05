package com.example.curriculoeste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String experiencia;
    
    public String getExperiencia() {
        return experiencia;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
