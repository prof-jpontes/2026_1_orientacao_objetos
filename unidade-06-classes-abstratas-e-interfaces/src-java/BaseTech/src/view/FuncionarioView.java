package view;

import control.ControllerFuncionario;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FuncionarioView {

    private final ControllerFuncionario control;
    private final Scanner teclado;

    public FuncionarioView(ControllerFuncionario control) {
        this.control = control;
        this.teclado = new Scanner(System.in);
    }
    public void iniciar() throws IOException, InterruptedException {
        byte opcao;
        do{
            System.out.print("Pressione enter para continuar. ");
            teclado.nextLine();
            limparConsole();
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
                System.out.println("Folha de pagamento: R$ " + control.getFolha());
                break;
            case 5:
                System.out.println(control.getRelatorioFuncionario());
                break;
            case 6:
                System.out.print("Informe o CPF: ");
                System.out.println(control.getRelatorioFuncionario(teclado.nextLine()));
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
        System.out.println("0- Sair do sistema.");
        System.out.print("Opção: ");

    }

    public static void limparConsole() throws InterruptedException, IOException {
        final String os = System.getProperty("os.name");
        if(os.contains("Windows")){
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        else{
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }
}
