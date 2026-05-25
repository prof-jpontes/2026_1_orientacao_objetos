package view;

import control.PagamentoController;

public class Programa {
    static void main(String[] args) {
        PagamentoController controller = new PagamentoController(new PagamentoView());
        controller.processarPagamentoCartao("Maçã",80,1);
        controller.processarPagamentoPix("Calça",120,"999");
        controller.processarPagamentoBoleto("Notebook",4500,"01/06/2026");
        controller.mostrarPagamento();


    }
}
