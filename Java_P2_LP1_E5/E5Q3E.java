import java.util.Scanner;

public class E5Q3E {

    public static void main(String[] args) {
        int vetorPar[] = new int[10];
        int vetorImpar[] = new int[10];

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 10 numeros inteiros:");
        
        for (int i = 0; i < 10; i++) {
            int numero = teclado.nextInt();
            if (numero % 2 == 0) {
                vetorPar[i] = numero;
            } else {
                vetorImpar[i] = numero;
            }
        }
        System.out.println("\n========== VETOR PAR ==========");
        for (int i = 0; i < vetorPar.length; i++) {
            if (vetorPar[i] != 0) {
                System.out.println(vetorPar[i]);
            }
        }
        System.out.println("\n========== VETOR IMPAR ==========");
        for (int i = 0; i < vetorImpar.length; i++) {
            if (vetorImpar[i] != 0) {
                System.out.println(vetorImpar[i]);
            }
        }
        teclado.close();
    }
}