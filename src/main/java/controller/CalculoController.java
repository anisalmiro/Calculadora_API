package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicos.CalculoRequest;
import servicos.CalculoResponse;

public class CalculoController {

    @RestController
    @RequestMapping("/calculadora")
    public static class CalculadoraController {

        @PostMapping("/")
        public CalculoResponse calcular(@RequestBody CalculoRequest rq) {

            CalculoResponse rs = new CalculoResponse();
            rs.setResultado(0.0);

            try {
                switch (rq.getOperacao()) {
                    case "+":
                        rs.setResultado(rq.getNumero1() + rq.getNumero2());
                        break;
                    case "-":
                        rs.setResultado(rq.getNumero1() - rq.getNumero2());
                        break;
                    case "*":
                        rs.setResultado(rq.getNumero1() * rq.getNumero2());
                        break;
                    case "/":
                        rs.setResultado(rq.getNumero1() / rq.getNumero2());
                        break;
                    default:
                        break;

                }
            } catch (Exception e) {
            }

            return rs;
        }

    }
}
