package model;

public class Guerreiro extends Personagem{
    private String arma;
    public Guerreiro(String nome, int forca, int vida) {
        super(nome, forca, vida);
    }
    public Guerreiro(String nome, int forca, int vida, String arma) {
        super(nome, forca, vida);
        this.arma = arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    @Override
    public String atacar() {
        if(this.arma != null){
            return super.atacar() + " utilizando uma " + this.arma;
        }
        return this.getNome() + " não possui uma arma para atacar!";
    }
}
