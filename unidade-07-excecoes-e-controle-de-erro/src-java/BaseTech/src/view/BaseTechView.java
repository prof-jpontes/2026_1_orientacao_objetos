package view;

import control.Controller;
import model.tipo.AnalistaSuporte;
import model.tipo.Desenvolvedor;
import model.tipo.GerenteProjeto;
import model.tipo.Nivel;

import java.io.IOException;
import java.util.Scanner;

public class BaseTechView {

    private final Controller control;
    private final Scanner teclado;

    public BaseTechView(Controller control) {
        this.control = control;
        this.teclado = new Scanner(System.in);
    }

    public void iniciar() {
        byte opcao;
        do {
            System.out.print("Pressione enter para continuar. ");
            teclado.nextLine();
            exibirMenu();
            try {
                opcao = Byte.parseByte(teclado.nextLine());
                processarOpcao(opcao);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digete um número inteiro menor do que 128");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }finally {
                opcao = -1;
            }


        } while (opcao != 0);
        teclado.close();
    }

    private void processarOpcao(byte opcao) {
        String nome, cpf;
        double salario = 0;
        switch (opcao) {
            case 1:
                System.out.print("Nome: ");
                nome = teclado.nextLine();
                System.out.print("Cpf: ");
                cpf = teclado.nextLine();
                System.out.print("Salario: R$ ");
                boolean leuSalario = false;
                while (!leuSalario) {
                    try {
                        salario = Double.parseDouble(teclado.nextLine());
                        leuSalario = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido! Digete um número real para o salário");
                    }
                }

                System.out.println("Tipo de funcionário: ");
                System.out.println("A - Desenvolvedor\nB - Analista de suporte\nC - Gerente de Projeto\nD - Nenhum");
                char o = teclado.nextLine().charAt(0);
                if (o != 'A' && o != 'B' && o != 'C' && o != 'D') {
                    throw new IllegalArgumentException(
                            "Caractere inválido: " + o + ". Esperado: A, B, C ou D."
                    );
                } else if (o == 'D') {
                    if (control.cadastrarFuncionario(nome, salario, cpf)) {
                        System.out.println("Funcionário cadastrado com sucesso!");
                    } else {
                        System.out.println("Já existe um funcionário com este CPF!");
                    }
                } else {
                    if (control.cadastrarFuncionarioAutenticavel(nome, salario, cpf)) {
                        System.out.println("Funcionário cadastrado com sucesso!");
                        if (o == 'A') {
                            control.adicionarTipo(cpf, new Desenvolvedor(Nivel.JUNIOR));
                        } else if (o == 'B') {
                            control.adicionarTipo(cpf, new AnalistaSuporte(50));
                        } else {
                            control.adicionarTipo(cpf, new GerenteProjeto());
                        }
                    } else {
                        System.out.println("Já existe um funcionário com este CPF!");
                    }
                }
                break;
            case 2:
                System.out.print("CPF: ");
                cpf = teclado.nextLine();
                System.out.println(control.adicionarTipo(cpf, new Desenvolvedor(Nivel.JUNIOR)));
                break;
            case 3:
                System.out.print("CPF: ");
                cpf = teclado.nextLine();
                System.out.println(control.adicionarTipo(cpf, new AnalistaSuporte(50)));
                break;
            case 4:
                System.out.print("CPF: ");
                cpf = teclado.nextLine();
                System.out.println(control.adicionarTipo(cpf, new GerenteProjeto()));
                break;
            case 5:
                System.out.println("Folha de pagamento: R$ " + String.format("%.2f", control.getFolha()));
                break;
            case 6:
                System.out.println(control.getRelatorioFuncionario());
                break;
            case 7:
                System.out.print("Informe o CPF: ");
                System.out.println(control.getRelatorioFuncionario(teclado.nextLine()));
                break;
            case 8:
                System.out.print("Informe o CPF do analista: ");
                System.out.println(control.registrarAtedimentoChamado(teclado.nextLine()));
                break;
            case 9:
                System.out.print("Login: ");
                String login = teclado.nextLine();
                System.out.print("Senha: ");
                String senha = teclado.nextLine();
                System.out.println(control.login(login, senha));
                break;
            case 10:
                System.out.print("Nome: ");
                nome = teclado.nextLine();
                System.out.print("Email: ");
                String email = teclado.nextLine();
                System.out.print("Bolsa: ");
                if (control.cadastrarEstagiario(nome, email, Double.parseDouble(teclado.nextLine()))) {
                    System.out.println("Estagiário cadastrado com sucesso!.");
                } else {
                    System.out.println("Estagiário já existente!.");
                }
                break;
            case 0:
                System.out.println("Você escolheu sair do sistema!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;

        }

    }

    private Scanner getTeclado() {
        return teclado;
    }

    private void exibirMenu() {
        System.out.println("\nESCOLHA UMA OPÇÃO!");
        System.out.println("1- Cadastrar um Funcionário.");
        System.out.println("2- Definir como desenvolvedor.");
        System.out.println("3- Definir como analista de suporte.");
        System.out.println("4- Definir como gerente de projeto.");
        System.out.println("5- Mostrar a folha de pagamento.");
        System.out.println("6- Mostrar relatório de todos os funcionários.");
        System.out.println("7- Mostrar relatório de um funcionário.");
        System.out.println("8- Registrar atendimento de chamado.");
        System.out.println("9- Realizar login.");
        System.out.println("10 - Cadastrar Estagiário.");
        System.out.println("0- Sair do sistema.");
        System.out.print("Opção: ");

    }
}
