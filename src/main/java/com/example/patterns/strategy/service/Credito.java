package com.example.patterns.strategy.service;

// Concret Strategy
public class Credito implements PagamentoStrategy {

    @Override
    public Double processar(Double valor) {
        Double taxaJuros = 0.3;
        return valor += valor * taxaJuros;
    }

}
