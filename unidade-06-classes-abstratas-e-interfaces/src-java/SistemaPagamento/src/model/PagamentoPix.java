package model;

public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(String descricao, double valor, String chavePix) {
        super(descricao, valor);
        this.chavePix = chavePix;
    }

    @Override
    public double calcularTaxa() {
        return - this.getValor() * 0.05;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public String toString() {
        String s = "PAGAMENTO POR PIX";
        s += "\n" + super.toString();
        s += "\n" + "Chave: " + getChavePix() + "\n";
        return s;
    }
}