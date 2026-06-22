package model.exception;

public class FuncionarioNaoLocalizadoException extends RuntimeException{
    public FuncionarioNaoLocalizadoException(String cpf) {
        super("CPF não localizado no sistema: " + cpf);
    }
}
