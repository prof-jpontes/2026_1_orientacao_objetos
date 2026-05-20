package view;

import model.Pagamento;
import model.PagamentoBoleto;
import model.PagamentoCartao;
import model.PagamentoPix;

public class PagamentoView {
    public void exibirPagamento(Pagamento pagamento){
        System.out.println(pagamento.toString());
    }
}
