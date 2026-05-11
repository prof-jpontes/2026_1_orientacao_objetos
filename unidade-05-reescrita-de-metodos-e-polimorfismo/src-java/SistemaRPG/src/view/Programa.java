package view;
import control.Controle;
public class Programa {
    public static void main(String[] args){
        Controle controle = new Controle();
        controle.criarPersonagem("João", 10, 10);
        controle.criarPersonagem("Marcus", 20, 20);
        controle.criarGuerreiro("Marisol", 50, 1, "baladeira");
        controle.criarMago("Milena", 1, 2);
        System.out.println(controle.getRelatorio());
        System.out.println("quantidade de personagens: " + controle.getContador());
        System.out.println("Ataques: \n" + controle.verAtaque());
    }
}
