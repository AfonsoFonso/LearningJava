
import java.util.Scanner;
// Read two numbers and print the sum, subtraction, multiplication and division of them
public class ExQuatro{
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int num1;
       int num2;
        System.out.print("Insira o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = scanner.nextInt();
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        float divisao = (float)num1 / num2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
