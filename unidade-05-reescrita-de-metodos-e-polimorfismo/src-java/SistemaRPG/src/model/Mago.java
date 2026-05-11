package model;

public class Mago extends Personagem {
    private int inteligencia;

    public Mago(String nome, int forca, int vida) {
        super(nome, forca, vida);
    }
    public Mago(String nome, int forca, int vida, int inteligencia) {
        this(nome, forca, vida);
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    @Override
    public String atacar() {
        return super.atacar() + " utilizando uma bola de fogo!";
    }
}
