package model;

public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(String descricao, double valor, String chavePix) {
        super(descricao, valor);
        this.chavePix = chavePix;
    }

    @Override
    public double calcularTaxa() {
        return 0.0;
    }

    public String getChavePix() {
        return chavePix;
    }
}