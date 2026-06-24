package model.exception;

public class ChaveJaCadastradaException extends RuntimeException{
    public ChaveJaCadastradaException(String chave, String tipo) {
        super(tipo + " já cadastrado no sistema: " + chave);
    }
}
