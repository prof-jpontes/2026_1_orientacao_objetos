package model;

public class Guerreiro extends Personagem{
    private String arma;
    public Guerreiro(String nome, int forca, int vida) {
        super(nome, forca, vida);
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public String atacar() {
        return super.atacar() + " utilizando uma " + this.arma;
    }
}
