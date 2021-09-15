package controller;


import org.springframework.web.bind.annotation.GetMapping;

public class testeController {

    @GetMapping("/aqui")
    public String welcomepage() {
        return "Teste Anisio ";
    }
}
