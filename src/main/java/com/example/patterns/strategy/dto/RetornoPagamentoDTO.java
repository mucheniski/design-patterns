package com.example.patterns.strategy.dto;

import lombok.Data;

@Data
public class RetornoPagamentoDTO {

    private String tipoPagamento;
    private Double valorInicial;
    private Double valorFinal;

}
