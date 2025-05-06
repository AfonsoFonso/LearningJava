import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        GerenciadorPessoas gerenciador = new GerenciadorPessoas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1) Cadastrar Aluno");
            System.out.println("2) Cadastrar Professor");
            System.out.println("3) Listar todos os cadastros");
            System.out.println("4) Listar apenas Alunos");
            System.out.println("5) Listar apenas Professores");
            System.out.println("0) Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeAluno = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idadeAluno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Email: ");
                    String emailAluno = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    gerenciador.salvarPessoa(new Aluno(nomeAluno, idadeAluno, emailAluno, matricula, curso));
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idadeProfessor = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Email: ");
                    String emailProfessor = scanner.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();
                    System.out.print("Quantidade de turmas: ");
                    int qtdeTurmas = scanner.nextInt();
                    scanner.nextLine();
                    gerenciador.salvarPessoa(new Professor(nomeProfessor, idadeProfessor, emailProfessor, disciplina, qtdeTurmas));
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Lista de todos os cadastros:");
                    gerenciador.listarTodos();
                    break;

                case 4:
                    System.out.println("Lista de Alunos:");
                    gerenciador.listarAlunos();
                    break;

                case 5:
                    System.out.println("Lista de Professores:");
                    gerenciador.listarProfessores();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}