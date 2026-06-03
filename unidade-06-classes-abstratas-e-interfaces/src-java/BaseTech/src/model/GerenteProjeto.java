package model;

public class GerenteProjeto extends Funcionario implements Autenticavel{

    private final double perBonificacao = 0.20;
    private String senha;
    public GerenteProjeto(String nome, double salario, String cpf) {
        super(nome, salario, cpf);
    }


    @Override
    public double getVencimentoMensal() {
        return this.getSalario() + this.perBonificacao * this.getSalario();
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
