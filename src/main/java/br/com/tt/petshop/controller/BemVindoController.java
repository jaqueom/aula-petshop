package br.com.tt.petshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bem-vindo")
public class BemVindoController {

    @GetMapping
    public String bemVindo(){
        return "bem_vindo";
    }
}
