package model;

public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(String descricao, double valor, String chavePix) {
        super(descricao, valor);
        this.chavePix = chavePix;
    }

    @Override
    public double calcularTaxa() {
        return 0;
    }

    public String getChavePix() {
        return chavePix;
    }

    @Override
    public double calcularTotal() {
        return this.getValor() * 0.95;
    }

    @Override
    public String toString() {
        String s = "\nPAGAMENTO POR PIX";
        s += "\n" + super.toString();
        s += "\n" + "Chave: " + getChavePix() + "\n";
        return s;
    }
}