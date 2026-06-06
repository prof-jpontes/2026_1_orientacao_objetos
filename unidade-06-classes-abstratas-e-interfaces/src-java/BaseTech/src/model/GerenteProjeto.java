package model;

public class GerenteProjeto extends FuncionarioAutenticavel{

    private final double perBonificacao = 0.20;

    public GerenteProjeto(String nome, double salario, String cpf) {
        super(nome, salario, cpf);
    }


    @Override
    public double getVencimentoMensal() {
        return this.getSalario() + this.perBonificacao * this.getSalario();
    }

}
