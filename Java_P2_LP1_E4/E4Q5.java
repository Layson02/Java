import java.util.Scanner;

public class E4Q5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para calcular seu fatorial:");
        int a = teclado.nextInt();
        long fat = 1;
        System.out.print(a + "! = ");
        for (int i = a; i >= 1; i--) {
            fat *= i;
            System.out.print(i + (i > 1 ? " * " : " = "));
        }
        System.out.println(fat);

        teclado.close();
    }
}
