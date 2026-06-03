package control;

import model.*;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Map<String, Funcionario> funcionarioMap = new HashMap<>();
    private Map<String, Autenticavel> autenticavelMap = new HashMap<>();
    public boolean cadastrarDesenvolvedor(String nome, String cpf, double salario, double bonus){
        if(funcionarioMap.get(cpf) == null){
            Funcionario f = new Desenvolvedor(nome,salario,cpf,bonus);
            funcionarioMap.put(cpf,f);
            autenticavelMap.put(cpf,(Autenticavel) f);
            return true;
        }
        return false;
    }
    public boolean cadastrarAnalistaSuporte(String nome, String cpf, double salario, double acr){
        if(funcionarioMap.get(cpf) == null){
            Funcionario f = new AnalistaSuporte(nome,salario,cpf,acr);
            funcionarioMap.put(cpf,f);
            autenticavelMap.put(cpf,(Autenticavel) f);
            return true;
        }
        return false;
    }
    public boolean cadastrarGerenteProjeto(String nome, String cpf, double salario){
        if(funcionarioMap.get(cpf) == null){
            Funcionario f = new GerenteProjeto(nome,salario,cpf);
            funcionarioMap.put(cpf,f);
            autenticavelMap.put(cpf,(Autenticavel) f);
            return true;
        }
        return false;
    }
    public double getFolha(){
        double total = 0;
        for (Funcionario f : funcionarioMap.values()){
            total += f.getVencimentoMensal();
        }
        return total;
    }

    public String getRelatorioFuncionario(){
        String s = "";
        for(Funcionario f : funcionarioMap.values()){
            s += f.toString() + "\n";
        }
        return s;
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
        if(funcionarioMap.get(cpf) instanceof AnalistaSuporte){
            ((AnalistaSuporte) funcionarioMap.get(cpf)).registrarAtendimento();
            return "Atendimento realizado!";
        }
        return "Este funcionário não pode realizar o atendimento!";
    }

    public String login(String usuario, String senha){
        Autenticavel a = this.autenticavelMap.get(usuario);
        if(a == null)return "Usuário ou senha incorreto!";
        if(SistemaInterno.login(a,senha))return "Login realizado!";
        return "Usuário ou senha incorreto!";
    }
}
