package model;

public class Desenvolvedor extends FuncionarioAutenticavel{

    private double bonus;

    public Desenvolvedor(String nome, double salario, String cpf, double bonus) {
        super(nome, salario, cpf);
        this.bonus = bonus;
    }

    @Override
    public double getVencimentoMensal() {
        return this.getSalario() + this.bonus;
    }

}
