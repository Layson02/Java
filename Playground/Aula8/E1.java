import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        int vetorA[] = new int[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros:");
        vetorA[0] = teclado.nextInt();
        vetorA[1] = teclado.nextInt();
        vetorA[2] = teclado.nextInt();
        vetorA[3] = teclado.nextInt();
        vetorA[4] = teclado.nextInt();
        System.out.println("Vetor A:");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetorA[" + i + "] = " + vetorA[i]);
        }

        int vetorB[] = new int[5];

        System.out.println("Vetor B:");

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
        
            System.out.println("vetorB[" + i + "] = " + vetorB[i]);
        }
        teclado.close();
    }
}
