
import java.util.Scanner;
//Exercise to verify if a number is greater than 10
public class ExUm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.print("Insira o número a ser verificado: ");
        numero = scan.nextInt();
        if (numero>10) {
            System.out.println("Número maior que 10!");
        } else {
            System.out.println("O número é menor ou igual a 10!");
        }

    }
}
