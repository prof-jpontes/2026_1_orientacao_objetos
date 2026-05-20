package control;

import model.Pagamento;
import model.PagamentoBoleto;
import model.PagamentoCartao;
import model.PagamentoPix;
import view.PagamentoView;

public class PagamentoController {
    private PagamentoView view;
    public PagamentoController(PagamentoView view){
        this.view = view;
    }
    public void processarCartao(String descricao, double valor, int numeroParcelas){
        PagamentoCartao cartao = new PagamentoCartao(descricao,valor,numeroParcelas);
    }
    public void processarPix(String descricao, double valor, String chavePix){
        PagamentoPix pix = new PagamentoPix(descricao,valor,chavePix);
    }
    public void processarBoleto(String descricao, double valor, String dataVencimento){
        PagamentoBoleto boleto = new PagamentoBoleto(descricao, valor, dataVencimento);
    }
    public void processarPagamento(){

    }

}
