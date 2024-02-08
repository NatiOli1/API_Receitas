package com.receitas.Model;

import java.util.*;

import com.receitas.Enum.AvaliacaoEnum;
import com.receitas.Enum.CategoriaEnum;
import com.receitas.Enum.DificuldadeEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Receita {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 200, nullable = false)
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ingredientes_id")
    private List<Ingrediente> ingredientes;

    @Column(nullable = false)
    private int tempoDePreparo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "etapa_preparo_id")
    private List<EtapaPreparo> etapas;

    @Column(length = 100, nullable = false)
    private String autor;

    @Column(length = 100,nullable = false)
    private String rendimentoDaReceita;

    private CategoriaEnum categoria;
    private DificuldadeEnum dificuldade;
    private AvaliacaoEnum avaliacao;
    private String observacao;

}
