package com.example.patterns.strategy.service;

// Concret Strategy
public class Boleto implements PagamentoStrategy {

    @Override
    public Double processar(Double valor) {
        Double taxaJuros = 0.4;
        return valor += valor * taxaJuros;
    }

}
