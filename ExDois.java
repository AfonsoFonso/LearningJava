
import java.util.Scanner;

public class ExDois {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int soma;
        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        soma = num1 + num2;
        System.out.println("A soma dos números é igual a:" + soma);
    }
}
