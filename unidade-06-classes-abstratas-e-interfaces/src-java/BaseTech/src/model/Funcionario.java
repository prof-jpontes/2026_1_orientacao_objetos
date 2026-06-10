package model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario implements Remuneravel {
    private String nome;
    private double salario;
    private String cpf;
    private List<Tipo> tipos = new ArrayList<>();

    public Funcionario(String nome, double salario, String cpf){
        this.nome = nome;
        this.salario = salario;
        this.cpf = cpf;
    }

    public void adicionarTipo(Tipo t){
        for(Tipo i : tipos){
            if(i.getDescricao().equals(t.getDescricao())){
                return;
            }
        }
        this.tipos.add(t);
    }

    public void removerTipo(Tipo t){
        this.tipos.remove(t);
    }



    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getVencimentoMensal(){
        double total = this.salario;
        for(Tipo t : tipos){
            total += t.calcularAdicional(this.salario);
        }
        return total;
    }

    public String tentarRealizarAtendimento(){
        for(Tipo t : tipos){
            if(t instanceof AnalistaSuporte){
                ((AnalistaSuporte) t).registrarAtendimento();
                return "Atendimento registrado!";
            }
        }
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
