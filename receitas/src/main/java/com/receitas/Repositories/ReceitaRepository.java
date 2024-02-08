package com.receitas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.receitas.Model.Receita;

public interface ReceitaRepository extends 
    JpaRepository<Receita, Integer> {
    
}
