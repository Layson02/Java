package aula6;
import java.util.Scanner;

public class Exercicio2 {
    public static void executar() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = teclado.nextDouble();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        teclado.close();
    }
}
