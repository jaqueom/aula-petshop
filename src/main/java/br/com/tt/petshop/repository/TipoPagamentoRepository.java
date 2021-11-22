package br.com.tt.petshop.repository;

import br.com.tt.petshop.model.TipoPagamento;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class TipoPagamentoRepository {

    public List<TipoPagamento> listar(){
        return Arrays.asList(TipoPagamento.values());
    }
}
