package model;

public class Personagem {
    private String nome;
    private int forca;
    private int vida;
    private static int cont = 0;

    public Personagem(String nome, int forca, int vida) {
        this.nome = nome;
        this.forca = forca;
        this.vida = vida;
        cont++;
    }

    public String atacar(){
        return this.nome + " atacou";
    }

    public void serAtacado() {
        this.vida--;
    }

    public int getVida() {
        return vida;
    }

    public static int getCont(){
        return cont;
    }
    @Override
    public String toString() {
        String relatorio = "Nome: " + this.nome;
        relatorio += "\nForça: " + this.forca;
        relatorio += "\nVida: " + this.vida;
        return relatorio;
    }
}
