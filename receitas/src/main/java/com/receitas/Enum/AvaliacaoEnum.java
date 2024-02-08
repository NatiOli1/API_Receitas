package com.receitas.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AvaliacaoEnum {
    UMA_ESTRELA("Uma estrela"),
    DUAS_ESTRELA("Duas estrelas"),
    TRES_ESTRELAS("Três estrelas"),
    QUATRO_ESTRELAS("Quatro estrelas"),
    CINCO_ESTRELAS("Cinco estrelas");

    private String avaliacao;

}
