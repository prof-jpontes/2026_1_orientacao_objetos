package control;

import model.Pagamento;
import model.PagamentoBoleto;
import model.PagamentoCartao;
import model.PagamentoPix;
import view.PagamentoView;

import java.util.ArrayList;
import java.util.List;

public class PagamentoController {
    private PagamentoView view;
    private List<Pagamento> pagamentoList = new ArrayList<>();

    public PagamentoController(PagamentoView view){
        this.view = view;
    }
    public void processarPagamentoCartao(String descricao, double valor, int numeroParcelas){
        Pagamento cartao = new PagamentoCartao(descricao,valor,numeroParcelas);
        pagamentoList.add(cartao);
    }
    public void processarPagamentoPix(String descricao, double valor, String chavePix){
        Pagamento pix = new PagamentoPix(descricao,valor,chavePix);
        pagamentoList.add(pix);
    }
    public void processarPagamentoBoleto(String descricao, double valor, String dataVencimento){
        Pagamento boleto = new PagamentoBoleto(descricao, valor, dataVencimento);
        pagamentoList.add(boleto);
    }
    public void mostrarPagamento(){
        for(Pagamento p : pagamentoList){
            view.exibirPagamento(p);
        }
    }

}
