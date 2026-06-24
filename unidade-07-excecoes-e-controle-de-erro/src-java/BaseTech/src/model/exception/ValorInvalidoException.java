package model.exception;

public class ValorInvalidoException extends RuntimeException{

    public ValorInvalidoException(String campo, double minimo, double valor) {
        super(campo + " não pode ser menor do que R$ " + String.format("%.2f", minimo) + ": R$ " + String.format("%.2f", valor));
    }
}
