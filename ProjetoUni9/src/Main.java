import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("==== CONCESSIONÁRIA ====");
            System.out.println("Olá! Seja bem-vindo.");
            System.out.println("1 - Pessoa Física");
            System.out.println("2 - Pessoa Jurídica");
            System.out.println("3 - Sair");

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
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (InputMismatchException e) {

                System.out.println("Erro: digite apenas números.");
                scanner.nextLine();
                opcao = 0;
            }

        } while (opcao != 3);

        scanner.close();
    }

    public static void cadastrarPessoaFisica() {

        System.out.println("Cadastro Pessoa Física");
        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();

        System.out.println("CPF informado: " + cpf);
    }

    public static void cadastrarPessoaJuridica() {

        System.out.println("Cadastro Pessoa Jurídica");
        System.out.println("Digite o CNPJ:");
        String cnpj = scanner.nextLine();

        System.out.println("CNPJ informado: " + cnpj);
    }
}