package view;

import control.Controle;

public class Programa {
    static void main(String[] args) {
        Controle controle = new Controle();
        controle.criarCirculo("Vermelho", 5, "circulo");
        controle.criarTriangulo("Amarelo",10,5,6);
        controle.criarQuadrilatero("Roxo", 7,8,9,10);
        controle.criarRetangulo("Azul", 8,9);
        controle.criarQuadrado("Lílas", 6);
        System.out.println(controle.toString());

    }
}
