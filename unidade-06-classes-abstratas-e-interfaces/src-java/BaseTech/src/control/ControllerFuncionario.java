package control;

import model.AnalistaSuporte;
import model.Desenvolvedor;
import model.Funcionario;
import model.GerenteProjeto;

import java.util.HashMap;
import java.util.Map;

public class ControllerFuncionario {
    Map<String, Funcionario> funcionarioMap = new HashMap<>();
    public boolean cadastrarDesenvolvedor(String nome, String cpf, double salario, double bonus){
        if(funcionarioMap.get(cpf) == null){
            Funcionario f = new Desenvolvedor(nome,salario,cpf,bonus);
            funcionarioMap.put(cpf,f);
            return true;
        }
        return false;
    }
    public boolean cadastrarAnalistaSuporte(String nome, String cpf, double salario, double acr){
        if(funcionarioMap.get(cpf) == null){
            funcionarioMap.put(cpf, new AnalistaSuporte(nome,salario,cpf,acr));
            return true;
        }
        return false;
    }
    public boolean cadastrarGerenteProjeto(String nome, String cpf, double salario){
        if(funcionarioMap.get(cpf) == null){
            funcionarioMap.put(cpf, new GerenteProjeto(nome,salario,cpf));
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
}
