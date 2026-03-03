import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu ano de nascimento?");
        int ano = entrada.nextInt();
        System.out.println("Sua idade é " + (2026 - ano));
    }
}