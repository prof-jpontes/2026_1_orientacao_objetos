package model;

public class AnalistaSuporte extends Funcionario implements Autenticavel{

    private int chamadosResolvidos;
    private  String senha;
    private double adicionalChamadosResolvidos;
    public AnalistaSuporte(String nome, double salario, String cpf, double adicionalChamadosResolvidos) {
        super(nome, salario, cpf);
        this.chamadosResolvidos = 0;
        this.adicionalChamadosResolvidos = adicionalChamadosResolvidos;
    }

    @Override
    public double getVencimentoMensal() {
        return this.getSalario() + this.chamadosResolvidos * this.adicionalChamadosResolvidos;
    }

    public void registrarAtendimento(){
        this.chamadosResolvidos++;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
