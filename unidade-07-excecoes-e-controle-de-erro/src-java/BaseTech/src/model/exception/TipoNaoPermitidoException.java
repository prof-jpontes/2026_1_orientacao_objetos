package model.exception;

public class TipoNaoPermitidoException extends RuntimeException{

    public TipoNaoPermitidoException(String nome){
        super("'" + nome + "' não pode receber tipos — não é um funcionário autenticável.");
    }
}
