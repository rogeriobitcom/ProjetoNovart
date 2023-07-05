package com.novart.crm.novart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Table(name = "Setor")
@Entity(name="Setor")
public class Setor {
    @Id
    private Long Codigo;

    @Column(name="Nome")
    private String nome;

}
