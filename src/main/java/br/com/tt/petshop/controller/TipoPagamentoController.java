package br.com.tt.petshop.controller;

import br.com.tt.petshop.model.TipoPagamento;
import br.com.tt.petshop.service.TipoPagamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipos-pagamento")
public class TipoPagamentoController {

    private final TipoPagamentoService tipoPagamentoService;

    public TipoPagamentoController(TipoPagamentoService tipoPagamentoService) {
        this.tipoPagamentoService = tipoPagamentoService;
    }

    @GetMapping
    public List<TipoPagamento> listar(){
        return tipoPagamentoService.listar();
    }

}
