package model;

public class PagamentoBoleto extends Pagamento {

    private String dataVencimento;

    public PagamentoBoleto(String descricao, double valor, String dataVencimento) {
        super(descricao, valor);
        this.dataVencimento = dataVencimento;
    }

    @Override
    public double calcularTaxa() {
        return 2.50;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    @Override
    public String toString() {
        String s = "\nPAGAMENTO COM BOLETO";
        s += "\n" + super.toString();
        s += "\n" + "Data de vencimento: " + getDataVencimento();
        return s;
    }
}