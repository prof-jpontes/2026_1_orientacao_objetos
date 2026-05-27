package view;

import control.ControllerFuncionario;

import java.util.Scanner;

public class FuncionarioView {

    private final ControllerFuncionario control;
    private final Scanner teclado;

    public FuncionarioView(ControllerFuncionario control) {
        this.control = control;
        this.teclado = new Scanner(System.in);
    }
    public void iniciar(){
        byte opcao;
        do{
            exibirMenu();
            opcao = Byte.parseByte(teclado.nextLine());
            processarOpcao(opcao);
        }while(opcao != 0);
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
                System.out.print("Salario: ");
                salario = Double.parseDouble(teclado.nextLine());
                System.out.println("Bônus: ");
                control.cadastrarDesenvolvedor(nome,cpf,salario,Double.parseDouble(teclado.nextLine()));
                break;
            case 2:
                System.out.print("Nome: " );
                nome = teclado.nextLine();
                System.out.print("Cpf: ");
                cpf = teclado.nextLine();
                System.out.print("Salario: ");
                salario = Double.parseDouble(teclado.nextLine());
                System.out.print("Adicional de chamados resolvidos: ");
                control.cadastrarAnalistaSuporte(nome,cpf,salario,Double.parseDouble(teclado.nextLine()));
                break;
            case 3:
                System.out.print("Nome: " );
                nome = teclado.nextLine();
                System.out.print("Cpf: ");
                cpf = teclado.nextLine();
                System.out.print("Salario: ");
                salario = Double.parseDouble(teclado.nextLine());
                control.cadastrarGerenteProjeto(nome,cpf,salario);
                break;
            case 4:
                System.out.println("Folha de pagamento: " + control.getFolha());
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
        System.out.println("1- Cadastrar um Desenvolvedor.");
        System.out.println("2- Cadastrar um Analista de Suporte.");
        System.out.println("3- Cadastrar um Gerente de Projeto.");
        System.out.println("4- Mostrar a folha de pagamento.");
        System.out.println("0- Sair do sistema.");

    }
}
