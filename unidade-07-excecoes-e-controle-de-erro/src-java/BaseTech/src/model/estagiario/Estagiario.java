package model.estagiario;


import model.Remuneravel;

public class Estagiario implements Remuneravel {
    private String nome;
    private String email;
    private double bolsa;

    public Estagiario(String nome, String email, double bolsa) {
        this.nome = nome;
        this.email = email;
        this.bolsa = bolsa;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getVencimentoMensal() {
        return bolsa;
    }
}
