package model.exception;

public class ValorInvalidoException extends RuntimeException{

    public ValorInvalidoException(String campo, double valor) {
        super(campo + " não pode ser negativo: " + valor);
    }
}
