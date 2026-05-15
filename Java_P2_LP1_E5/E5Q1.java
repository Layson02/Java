import java.util.Scanner;
import java.util.Arrays;

public class E5Q1 {
    public static void main(String[] args) {
        int vetorA[] = new int[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 5 numeros inteiros:");

        vetorA[0] = teclado.nextInt();
        vetorA[1] = teclado.nextInt();
        vetorA[2] = teclado.nextInt();
        vetorA[3] = teclado.nextInt();
        vetorA[4] = teclado.nextInt();
        
        System.out.println("\n========== VETOR A ==========");
        System.out.println("Valores: " + Arrays.toString(vetorA));

        int vetorB[] = new int[5];

        System.out.println("\n========== VETOR B (QUADRADOS) ==========");
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("Valores: " + Arrays.toString(vetorB));
        
        System.out.println("\n---------- Detalhado ----------");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i] + "² = " + vetorB[i]);
        }
        
        teclado.close();
    }
}