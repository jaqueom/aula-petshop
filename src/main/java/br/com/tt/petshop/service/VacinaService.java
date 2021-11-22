package br.com.tt.petshop.service;

import br.com.tt.petshop.model.Vacina;
import br.com.tt.petshop.repository.VacinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacinaService {

    private VacinaRepository vacinaRepository;

    public VacinaService(VacinaRepository vacinaRepository) {
        this.vacinaRepository = vacinaRepository;
    }

    public List<Vacina> listarVacinas(){
        return vacinaRepository.listarVacinas();
    }

}
