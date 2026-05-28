import controller.ClienteControle;
import model.*;

import java.util.InputMismatchException;
import java.util.Scanner;
//Oi Professor! Segue os RA abaixo
// 424105056 - Thaisa Cuiza Suzano (lider)
//424104278 - Gabriel Chojlu Luna
// 923105455 - Edilson Condori Laura
public class Main {

    static Scanner scanner = new Scanner(System.in);

    // CLIENTES
    static ClienteControle clienteControle =
            new ClienteControle();

    // VEÍCULOS
    static SistemasDeVendasVe sistemaVeiculos =
            new SistemasDeVendasVe();

    public static void main(String[] args) {

        int opcao = 0;

        do {

            System.out.println("\n===== CONCESSIONÁRIA =====");

            System.out.println("1 - Cadastrar Pessoa Física");
            System.out.println("2 - Cadastrar Pessoa Jurídica");
            System.out.println("3 - Listar Clientes");

            System.out.println("4 - Cadastrar Veículo");
            System.out.println("5 - Listar Veículos");
            System.out.println("6 - Remover Veículo");

            System.out.println("7 - Sair");

            System.out.print("Escolha uma opção: ");

            try {

                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {

                    case 1:
                        cadastrarPessoaFisica();
                        break;

                    case 2:
                        cadastrarPessoaJuridica();
                        break;

                    case 3:
                        clienteControle.listarClientes();
                        break;

                    case 4:
                        cadastrarVeiculo();
                        break;

                    case 5:
                        sistemaVeiculos.listarVeiculos();
                        break;

                    case 6:
                        removerVeiculo();
                        break;

                    case 7:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (InputMismatchException e) {

                System.out.println("Digite apenas números.");
                scanner.nextLine();

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());

            }

        } while (opcao != 7);

        scanner.close();
    }

    // CLIENTE

    public static void cadastrarPessoaFisica() {

        System.out.println("\n=== Cadastro Pessoa Física ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Contato: ");
        String contato = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        PessoaFisica pf =
                new PessoaFisica(nome, contato, cpf, idade);

        clienteControle.cadastrarCliente(pf);
    }

    public static void cadastrarPessoaJuridica() {

        System.out.println("\n=== Cadastro Pessoa Jurídica ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Contato: ");
        String contato = scanner.nextLine();

        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        System.out.print("Nome da Empresa: ");
        String empresa = scanner.nextLine();

        PessoaJuridica pj =
                new PessoaJuridica(nome, contato, cnpj, empresa);

        clienteControle.cadastrarCliente(pj);
    }

    // VEÍCULOS

    public static void cadastrarVeiculo() {

        System.out.println("\n=== Cadastro de Veículo ===");

        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.println("3 - Utilitário");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("ID: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Fabricante: ");
        String fabricante = scanner.nextLine();

        System.out.print("Ano de fabricação: ");
        int ano = scanner.nextInt();

        System.out.print("Preço: ");
        int preco = scanner.nextInt();
        scanner.nextLine();

        switch (tipo) {

            case 1:

                System.out.print("Quantidade de portas: ");
                int portas = scanner.nextInt();

                System.out.print("Capacidade de passageiros: ");
                int passageiros = scanner.nextInt();
                scanner.nextLine();

                Carro carro = new Carro();

                carro.setId(id);
                carro.setModelo(modelo);
                carro.setFabricante(fabricante);
                carro.setAnoFabricacao(ano);
                carro.setPreco(preco);
                carro.setPortas(portas);
                carro.setCapacidadePassageiros(passageiros);

                sistemaVeiculos.cadastrarVeiculo(carro);

                break;

            case 2:

                System.out.print("Cilindrada: ");
                scanner.nextLine();
                String cilindrada = scanner.nextLine();
                

                Moto moto = new Moto();

                moto.setId(id);
                moto.setModelo(modelo);
                moto.setFabricante(fabricante);
                moto.setAnoFabricacao(ano);
                moto.setPreco(preco);
                moto.setCilindrada(cilindrada);

                sistemaVeiculos.cadastrarVeiculo(moto);

                break;

            case 3:

                System.out.print("Capacidade de carga: ");
                int carga = scanner.nextInt();
                scanner.nextLine();

                Utilitario utilitario = new Utilitario();

                utilitario.setId(id);
                utilitario.setModelo(modelo);
                utilitario.setFabricante(fabricante);
                utilitario.setAnoFabricacao(ano);
                utilitario.setPreco(preco);
                utilitario.setCapacidadeCarga(carga);

                sistemaVeiculos.cadastrarVeiculo(utilitario);

                break;

            default:
                System.out.println("Tipo inválido!");
        }
    }

    public static void removerVeiculo() {

        System.out.print("Digite o ID do veículo: ");

        Long id = scanner.nextLong();
        scanner.nextLine();

        sistemaVeiculos.deletarVeiculo(id);
    }
}