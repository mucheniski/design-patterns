package com.example.patterns.enums;

public enum TipoPagamento {
    CREDITO("CREDITO"),
    DEBITO("DEBITO"),
    BOLETO("BOLETO"),
    PIX("PIX");

    private String descricao;

    TipoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
