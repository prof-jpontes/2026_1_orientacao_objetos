package control;

import model.*;
import model.estagiario.Estagiario;
import model.funcionario.Funcionario;
import model.funcionario.FuncionarioAutenticavel;
import model.tipo.Tipo;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Map<String, Funcionario> funcionarioMap = new HashMap<>();
    private Map<String, Remuneravel> remuneravelMap = new HashMap<>();
    private SistemaInterno si = new SistemaInterno();


    private void cadastrarFuncionario(Funcionario f){
        remuneravelMap.put(f.getCpf(), f);
        funcionarioMap.put(f.getCpf(), f);
        if(f instanceof Autenticavel){
            si.cadastrar(f.getCpf(), (Autenticavel) f);
        }
    }
    public boolean cadastrarFuncionario(String nome, double salario, String cpf){
        if(this.funcionarioMap.containsKey(cpf)) return false;
        this.cadastrarFuncionario(new Funcionario(nome,salario,cpf));
        return true;
    }
    public boolean cadastrarEstagiario(String nome, String email, double bolsa){
        if(this.remuneravelMap.containsKey(email)) return false;
        this.remuneravelMap.put(email,new Estagiario(nome,email,bolsa));
        return true;
    }
    public boolean cadastrarFuncionarioAutenticavel(String nome, double salario, String cpf){
        if(this.funcionarioMap.containsKey(cpf)) return false;

        this.cadastrarFuncionario(new FuncionarioAutenticavel(nome,salario,cpf));
        return true;
    }

    public String adicionarTipo(String chave, Tipo t){
        if(this.funcionarioMap.get(chave) instanceof FuncionarioAutenticavel){
            this.funcionarioMap.get(chave).adicionarTipo(t);
            return "Funcionário " + funcionarioMap.get(chave).getNome() + " definido como " + t.getDescricao();
        }
        return "Não foi possível definir o funcionário " + funcionarioMap.get(chave).getNome() + " como " + t.getDescricao();
    }
    public double getFolha(){
        double total = 0;
        for (Remuneravel r : remuneravelMap.values()){
            total += r.getVencimentoMensal();
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
