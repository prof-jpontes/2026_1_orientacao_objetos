package control;

import model.*;
import model.estagiario.Estagiario;
import model.exception.ChaveJaCadastradaException;
import model.exception.FuncionarioNaoLocalizadoException;
import model.exception.TipoNaoPermitidoException;
import model.funcionario.Funcionario;
import model.funcionario.FuncionarioAutenticavel;
import model.tipo.Desenvolvedor;
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

    public void cadastrarFuncionario(String nome, double salario, String cpf){
        if(this.funcionarioMap.containsKey(cpf)){
            throw new ChaveJaCadastradaException(cpf, "CPF");
        }
        this.cadastrarFuncionario(new Funcionario(nome,salario,cpf));
    }

    public void cadastrarFuncionarioAutenticavel(String nome, double salario, String cpf){
        if(this.funcionarioMap.containsKey(cpf)){
            throw new ChaveJaCadastradaException(cpf, "CPF");
        }
        this.cadastrarFuncionario(new FuncionarioAutenticavel(nome,salario,cpf));
    }

    public void cadastrarEstagiario(String nome, String email, double bolsa){

        if(this.remuneravelMap.containsKey(email)){
            throw new ChaveJaCadastradaException(email, "E-mail");
        }
        this.remuneravelMap.put(email,new Estagiario(nome,email,bolsa));
    }


    public void adicionarTipo(String chave, Tipo t){
        Funcionario f = funcionarioMap.get(chave);
        if(f == null) throw new FuncionarioNaoLocalizadoException(chave);

        if(!(f instanceof FuncionarioAutenticavel)){
            throw new TipoNaoPermitidoException(f.getNome());
        }
        f.adicionarTipo(t);

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

    public void promoverDesenvolvedor(String cpf){
        Funcionario f = funcionarioMap.get(cpf);
        if(f == null) throw new FuncionarioNaoLocalizadoException(cpf);

        for(Tipo t : f.getTipos()){
            if (t.getDescricao().equals("Desenvolvedor")){
                Desenvolvedor d = (Desenvolvedor) t;
                d.promover();
            }
        }
    }
}
