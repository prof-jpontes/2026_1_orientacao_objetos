package model.exception;

public class CpfCadastradoException extends RuntimeException{
    public CpfCadastradoException(String cpf) {
        super("CPF já cadastrado no sistema: " + cpf);
    }
}
