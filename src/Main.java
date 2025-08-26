import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Escola escola = new Escola();
        int opcao;

        do {
            System.out.println("\nEscolha a opção:");
            System.out.println("1- Cadastrar aluno");
            System.out.println("2- Exibir alunos");
            System.out.println("0- Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    escola.cadastrarAluno(nome, endereco, telefone, email);
                    break;

                case 2:
                    escola.exibirAlunos();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
