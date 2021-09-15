package servicos;

public class CalculoRequest {

    private Double a;
    private Double b;
    private String operacao;

    public CalculoRequest() {
    }

    public Double getNumero1() {
        return a;
    }

    public void setNumero1(Double a) {
        this.a = a;
    }

    public Double getNumero2() {
        return b;
    }

    public void setNumero2(Double b) {
        this.b = b;
    }


    public String setOperacao() {
        return operacao;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }


}
