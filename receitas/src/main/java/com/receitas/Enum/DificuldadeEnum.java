package com.receitas.Enum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DificuldadeEnum {
    FACIL("Fácil"),
    MEDIO("Médio"),
    DIFICIL("Dificil");

    private String dificuldade;
}
