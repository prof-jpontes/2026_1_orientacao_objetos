package model;

public class AnalistaSuporte extends Funcionario{

    private int chamadosResolvidos;
    private double adicionalChamadosResolvidos;
    public AnalistaSuporte(String nome, double salario, String cpf, int adicionalChamadosResolvidos) {
        super(nome, salario, cpf);
        this.chamadosResolvidos = 0;
        this.adicionalChamadosResolvidos = adicionalChamadosResolvidos;
    }

    @Override
    public double getVencimentoMensal() {
        return this.getSalario() + this.chamadosResolvidos * this.adicionalChamadosResolvidos;
    }
}
