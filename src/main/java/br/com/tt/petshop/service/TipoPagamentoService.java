package br.com.tt.petshop.service;

import br.com.tt.petshop.model.TipoPagamento;
import br.com.tt.petshop.repository.TipoPagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagamentoService {

    private final TipoPagamentoRepository tipoPagamentoRepository;

    public TipoPagamentoService(TipoPagamentoRepository tipoPagamentoRepository) {
        this.tipoPagamentoRepository = tipoPagamentoRepository;
    }

    public List<TipoPagamento> listar() {
        return tipoPagamentoRepository.listar();
    }
}
