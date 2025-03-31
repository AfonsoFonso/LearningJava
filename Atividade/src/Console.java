import java.util.Scanner;

public class Console {

    private Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public String getFuncionario() {
        System.out.print("Digite o nome do funcionário: ");
        return scanner.nextLine();
    }

    public int getHorasTrabalhadas() {
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        return scanner.nextInt();
    }

    public float getValorHora() {
        System.out.print("Digite o valor do salário por hora: ");
        return scanner.nextFloat();
    }

}