package model;

public abstract class Pagamento {

    private String descricao;
    private double valor;

    public Pagamento(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract double calcularTaxa();

    public double calcularTotal() {
        return valor + calcularTaxa();
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        String s = "\n" + "Descrição: " + getDescricao();
        s += "\n" + "Valor: " + String.format("%.2f",getValor());
        s += "\n" + "Taxa: R$ " + String.format("%.2f",calcularTaxa());
        s += "\n" + "Total do pagamento: R$ " + String.format("%.2f",calcularTotal());
        return s;
    }
}