
import java.util.Scanner;
// Read two numbers and print the largest one or a message if they are equal.
public class ExTres{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Insira o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (num1 < num2){
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("A sequência de números é inválida.");
        }
    }
}
