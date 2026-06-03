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


    @Override
    public String toString() {
        String s = "\nNome: " + this.nome;
        s += "\nCPF: " + this.cpf;
        s += "\nSalário: R$ " + this.salario;
        s += "\nVecimento mensal: R$ " + this.getVencimentoMensal();
        return s;
    }
}
