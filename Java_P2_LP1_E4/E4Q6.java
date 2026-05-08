import java.util.Scanner;

public class E4Q6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite qualquer número (0 para sair):");
        int num;
        do {
            num = teclado.nextInt();
            if (num != 0) System.out.println("Digitado: " + num);
        } while (num != 0);

        teclado.close();
    }
}
