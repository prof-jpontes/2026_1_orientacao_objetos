package model.exception;

public class NivelMaximoException extends RuntimeException{
    public NivelMaximoException(String nome){
        super("'" + nome + "' já está no nível máximo (SÊNIOR)");
    }
}
