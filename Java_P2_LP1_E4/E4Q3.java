import java.util.Scanner;

public class E4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 números:");
        double soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += sc.nextDouble();
        }
        System.out.println("Média: " + (soma / 10));
        
        sc.close();
    }
}
