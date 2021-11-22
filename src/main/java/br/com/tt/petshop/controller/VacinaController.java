package br.com.tt.petshop.controller;

import br.com.tt.petshop.model.Vacina;
import br.com.tt.petshop.service.VacinaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vacinas")
public class VacinaController {

    /*
    // Versão 1 - sem SPRING
    public VacinaController() {
        vacinaService = new VacinaService();
    }
    //Versão 2 - Com Autowired
    @Autowired // Diz ao Spring para fazer a Injeção de Dependência
    private VacinaService vacinaService;
    */

    private final VacinaService vacinaService;

    //Versão 3 - com o construtor
    public VacinaController(VacinaService vacinaService) {
        this.vacinaService = vacinaService;
    }

    @GetMapping
    public List<Vacina> listarVacinas(){

        return vacinaService.listarVacinas();
    }
}
