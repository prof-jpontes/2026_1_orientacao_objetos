package model;

public class PagamentoCartao extends Pagamento {

    private int numeroParcelas;

    public PagamentoCartao(String descricao, double valor, int  numeroParcelas) {
        super(descricao, valor);
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.05 * (numeroParcelas - 1);
    }

    public double calcularValorParcela() {
        return calcularTotal() / numeroParcelas;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    @Override
    public String toString() {
        String s = "\nPAGAMENTO COM CARTÃO";
        s += "\n" + super.toString();
        s += "\n" + "Número de parcelas: " + getNumeroParcelas();
        return s;
    }
}