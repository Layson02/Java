import java.util.Scanner;

public class E4Q4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 10 idades:");
        int maior = 0;
        for (int i = 0; i < 10; i++) {
            int idade = teclado.nextInt();
            if (idade > maior) {
                maior = idade;
            }
        }
        System.out.println("Maior idade: " + maior);

        teclado.close();
    }
}
