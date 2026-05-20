package model;

public class Pagamento {

    private String descricao;
    private double valor;

    public Pagamento(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public double calcularTaxa() {
        return 0.0;
    }

    public double calcularTotal() {
        return valor + calcularTaxa();
    }

    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
}