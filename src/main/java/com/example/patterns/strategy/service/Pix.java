package com.example.patterns.strategy.service;

// Concret Strategy
public class Pix implements PagamentoStrategy {

    @Override
    public Double processar(Double valor) {
        Double taxaJuros = 0.0;
        return valor += valor * taxaJuros;
    }

}
