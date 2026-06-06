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

    public String tentarRealizarAtendimento(){
        return "Este funcionário não pode realizar atendimento!";
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        String s = "\nNome: " + this.nome;
        s += "\nCPF: " + this.cpf;
        s += "\nSalário: R$ " + String.format("%.2f",this.salario);
        s += "\nVecimento mensal: R$ " + String.format("%.2f",this.getVencimentoMensal());
        return s;
    }
}
