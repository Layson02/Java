import java.util.Scanner;

public class E5Q2 {
    public static void main(String[] args) {
        int vetorX[] = new int[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 5 numeros");

        vetorX[0] = teclado.nextInt();
        vetorX[1] = teclado.nextInt();
        vetorX[2] = teclado.nextInt();
        vetorX[3] = teclado.nextInt();
        vetorX[4] = teclado.nextInt();

        System.out.println("Vetor X:");
        
        for (int i = 0; i < vetorX.length; i++) {
            System.out.println("vetorX[" + i + "] = " + vetorX[i]);
        }

        int vetorY[] = new int[5];

        System.out.println("Vetor Y:");

        for (int i = 0; i < vetorX.length; i++) {
            vetorY[i] = vetorX[i] % 2;
        
            System.out.println("vetorY[" + i + "] = " + vetorY[i]);
        }
        teclado.close();
    }
}
