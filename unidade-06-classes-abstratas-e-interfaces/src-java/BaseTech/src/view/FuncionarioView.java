package view;

import control.Controller;

import java.io.IOException;
import java.util.Scanner;

public class FuncionarioView {

    private final Controller control;
    private final Scanner teclado;

    public FuncionarioView(Controller control) {
        this.control = control;
        this.teclado = new Scanner(System.in);
    }
    public void iniciar() throws IOException, InterruptedException {
        byte opcao;
        do{
            System.out.print("Pressione enter para continuar. ");
            teclado.nextLine();
            exibirMenu();
            opcao = Byte.parseByte(teclado.nextLine());
            processarOpcao(opcao);
        }while(opcao != 0);
        teclado.close();
    }

    private void processarOpcao(byte opcao) {
        String nome, cpf;
        double salario;
        switch (opcao){
            case 1:
                System.out.print("Nome: " );
                nome = teclado.nextLine();
                System.out.print("Cpf: ");
                cpf = teclado.nextLine();
                System.out.print("Salario: R$ ");
                salario = Double.parseDouble(teclado.nextLine());
                System.out.print("Bônus: R$ ");
                if(control.cadastrarDesenvolvedor(nome,cpf,salario,Double.parseDouble(teclado.nextLine()))) {
                    System.out.println("Funcionário cadastrado com sucesso!");
                }else{
                    System.out.println("Já existe um funcionário com este CPF!");
                }
                break;
            case 2:
                System.out.print("Nome: " );
                nome = teclado.nextLine();
                System.out.print("Cpf: ");
                cpf = teclado.nextLine();
                System.out.print("Salario: R$ ");
                salario = Double.parseDouble(teclado.nextLine());
                System.out.print("Valor por chamado resolvido: RS ");
                if(control.cadastrarAnalistaSuporte(nome,cpf,salario,Double.parseDouble(teclado.nextLine()))){
                    System.out.println("Funcionário cadastrado com sucesso!");
                }
                else {
                    System.out.println("Já existe um funcionário com este CPF");
                }
                break;
            case 3:
                System.out.print("Nome: " );
                nome = teclado.nextLine();
                System.out.print("Cpf: ");
                cpf = teclado.nextLine();
                System.out.print("Salario: R$ ");
                salario = Double.parseDouble(teclado.nextLine());
                if(control.cadastrarGerenteProjeto(nome,cpf,salario)){
                    System.out.println("Funcionário cadastrado com sucesso!");
                }
                else {
                    System.out.println("Já existe um funcionário com este CPF!");
                }
                break;
            case 4:
                System.out.println("Folha de pagamento: R$ " + String.format("%.2f", control.getFolha()));
                break;
            case 5:
                System.out.println(control.getRelatorioFuncionario());
                break;
            case 6:
                System.out.print("Informe o CPF: ");
                System.out.println(control.getRelatorioFuncionario(teclado.nextLine()));
                break;
            case 7:
                System.out.print("Informe o CPF do analista: ");
                System.out.println(control.registrarAtedimentoChamado(teclado.nextLine()));
                break;
            case 8:
                System.out.print("Login: ");
                String login = teclado.nextLine();
                System.out.print("Senha: ");
                String senha = teclado.nextLine();
                System.out.println(control.login(login,senha));
                break;
            case 0:
                System.out.println("Você escolheu sair do sistema!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;

        }

    }

    private void exibirMenu(){
        System.out.println("\nESCOLHA UMA OPÇÃO!");
        System.out.println("1- Cadastrar um Desenvolvedor.");
        System.out.println("2- Cadastrar um Analista de Suporte.");
        System.out.println("3- Cadastrar um Gerente de Projeto.");
        System.out.println("4- Mostrar a folha de pagamento.");
        System.out.println("5- Mostrar relatório de todos os funcionários.");
        System.out.println("6- Mostrar relatório de um funcionário.");
        System.out.println("7- Registrar atendimento de chamado.");
        System.out.println("8- Realizar login.");
        System.out.println("0- Sair do sistema.");
        System.out.print("Opção: ");

    }
}
