package com.novart.crm.novart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Table(name = "Produto")
@Entity(name="Produto")
public class Produto {
    @Id
    private Long codigo;

    @Column(name="VlTabela")
    private BigDecimal vlTabela;

    @Column(name="Check_1")
    private String check;

    @Column(name="CodSetor")
    private Long codsetor;

    @Column(name="ComplSite")
    private String complSite;

    @Column(name="Nome")
    private String nome;

}
