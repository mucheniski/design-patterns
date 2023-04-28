package com.example.patterns.strategy.service;

import com.example.patterns.enums.TipoPagamento;
import com.example.patterns.strategy.dto.RetornoPagamentoDTO;
import org.springframework.stereotype.Service;

// Context Strategy
@Service
public class PagamentoService {

    public RetornoPagamentoDTO processar(TipoPagamento tipoPagamento, Double valor) {
        RetornoPagamentoDTO retornoPagamentoDTO = new RetornoPagamentoDTO();
        PagamentoStrategy pagamentoStrategy;

        switch (tipoPagamento) {
            case CREDITO:
                pagamentoStrategy = new Credito();
                retornoPagamentoDTO.setTipoPagamento("Pagamento com Crédito");
                break;
            case DEBITO:
                pagamentoStrategy = new Debito();
                retornoPagamentoDTO.setTipoPagamento("Pagamento com Debito");
                break;
            case BOLETO:
                pagamentoStrategy = new Boleto();
                retornoPagamentoDTO.setTipoPagamento("Pagamento com Boleto");
                break;
            case PIX:
                pagamentoStrategy = new Pix();
                retornoPagamentoDTO.setTipoPagamento("Pagamento com Boleto");
                break;
            default:
                pagamentoStrategy = null;
                retornoPagamentoDTO.setTipoPagamento("Tipo de pagamento desconhecido");

        }

        if (pagamentoStrategy != null) {
            retornoPagamentoDTO.setValorInicial(valor);
            retornoPagamentoDTO.setValorFinal(pagamentoStrategy.processar(valor));
        } else {
            retornoPagamentoDTO.setValorInicial(0.0);
            retornoPagamentoDTO.setValorFinal(0.0);
        }

        return retornoPagamentoDTO;

    }

}
