package aula6;
import java.util.Scanner;

public class Media {
    public static void executar() {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2;
        do {
            System.out.print("Digite a primeira nota (0 a 10): ");
            nota1 = teclado.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Erro: A nota deve estar entre 0 e 10!");
            }
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a segunda nota (0 a 10): ");
            nota2 = teclado.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Erro: A nota deve estar entre 0 e 10!");
            }
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;
        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else if (media >= 5) {
            System.out.println("Status: Recuperação");
        } else {
            System.out.println("Status: Reprovado");
        }
        teclado.close();
    }
}