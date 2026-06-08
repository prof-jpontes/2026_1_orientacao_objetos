package model;

public class FuncionarioAutenticavel extends Funcionario implements Autenticavel{
    private  String senha;
    public FuncionarioAutenticavel(String nome, double salario, String cpf) {
        super(nome, salario, cpf);
        this.senha = "1234";
    }

    public boolean setSenha(String senha, String novaSenha) {
        if(this.senha.equals(senha)){
            this.senha = novaSenha;
            return true;
        }
        return false;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
