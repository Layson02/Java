import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double num1 = entrada.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = entrada.nextDouble();
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
    }
}