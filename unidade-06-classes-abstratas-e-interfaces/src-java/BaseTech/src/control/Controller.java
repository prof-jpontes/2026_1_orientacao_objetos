package control;

import model.*;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Map<String, Funcionario> funcionarioMap = new HashMap<>();
    private SistemaInterno si = new SistemaInterno();


    private void cadastrarFuncionario(Funcionario f){
        funcionarioMap.put(f.getCpf(), f);
        if(f instanceof Autenticavel){
            si.cadastrar(f.getCpf(), (Autenticavel) f);
        }
    }

    public boolean cadastrarFuncionarioAutenticavel(String nome, double salario, String cpf){
        if(this.funcionarioMap.containsKey(cpf)) return false;

        this.cadastrarFuncionario(new FuncionarioAutenticavel(nome,salario,cpf));
        return true;
    }

    public void adicionarTipo(String chave, Tipo t){
        this.funcionarioMap.get(chave).adicionarTipo(t);
    }
    public double getFolha(){
        double total = 0;
        for (Funcionario f : funcionarioMap.values()){
            total += f.getVencimentoMensal();
        }
        return total;
    }

    public String getRelatorioFuncionario(){
        StringBuilder sb = new StringBuilder();
        for(Funcionario f : funcionarioMap.values()){
            sb.append(f.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
    public String getRelatorioFuncionario(String cpf){
        if(funcionarioMap.get(cpf) != null){
            return funcionarioMap.get(cpf).toString();
        }
        return "Funcionário não localizado!";
    }

    public String registrarAtedimentoChamado(String cpf){
        if(funcionarioMap.get(cpf) == null){
            return "Funcionário não localizado!";
        }

        return this.funcionarioMap.get(cpf).tentarRealizarAtendimento();
    }

    public String login(String usuario, String senha){
        if(si.login(usuario, senha)) return "Login realizado!";
        return "Usuário ou senha incorretos!";
    }
}
