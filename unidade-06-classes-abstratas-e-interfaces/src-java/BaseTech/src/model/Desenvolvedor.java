package model;

public class Desenvolvedor extends Funcionario implements Autenticavel{

    private double bonus;
    private String senha;

    public Desenvolvedor(String nome, double salario, String cpf, double bonus) {
        super(nome, salario, cpf);
        this.bonus = bonus;
        this.senha = "1234";
    }

    @Override
    public double getVencimentoMensal() {
        return this.getSalario() + this.bonus;
    }


    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
