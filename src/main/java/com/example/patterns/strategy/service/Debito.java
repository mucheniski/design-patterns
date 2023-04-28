package com.example.patterns.strategy.service;

// Concret Strategy
public class Debito implements PagamentoStrategy {

    @Override
    public Double processar(Double valor) {
        Double taxaJuros = 0.1;
        return valor += valor * taxaJuros;
    }

}
