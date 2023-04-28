package com.example.patterns.strategy.controller;

import com.example.patterns.enums.TipoPagamento;
import com.example.patterns.strategy.dto.RetornoPagamentoDTO;
import com.example.patterns.strategy.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    @GetMapping("/processar")
    public ResponseEntity<RetornoPagamentoDTO> processar(@RequestParam TipoPagamento tipoPagamento, @RequestParam Double valor) {
        RetornoPagamentoDTO retornoPagamentoDTO = service.processar(tipoPagamento, valor);
        return ResponseEntity.ok().body(retornoPagamentoDTO);
    }

}
