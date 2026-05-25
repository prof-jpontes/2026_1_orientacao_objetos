package model;

public abstract  class Funcionario {
    private String nome;
    private double salario;
    private String cpf;

    public Funcionario(String nome, double salario, String cpf){
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double getVencimentoMensal();
}
