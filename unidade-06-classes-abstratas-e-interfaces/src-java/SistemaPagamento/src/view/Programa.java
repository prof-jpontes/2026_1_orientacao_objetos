package view;

import control.PagamentoController;

public class Programa {
    static void main(String[] args) {
        PagamentoController controller = new PagamentoController(new PagamentoView());
        controller.processarCartao("Maçã",80,1);
        controller.processarPix("Calça",120,"999");
        controller.processarBoleto("Notebook",4500,"01/06/2026");


    }
}
