package view;

import control.Controle;

public class Programa {
    static void main(String[] args) {
        Controle controle = new Controle();
        controle.criarCirculo("Vermelho", 5);
        controle.criarTriangulo("Amarelo",10,10,10);
        controle.criarQuadrilatero("Roxo", 7,8,9,10);
        System.out.println(controle.toString());

    }
}
